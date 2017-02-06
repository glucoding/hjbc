package com.hejiascm.web.rest;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Roles;
import com.hejiascm.domain.Users;
import com.hejiascm.service.OrginfoService;
import com.hejiascm.service.RolesService;
import com.hejiascm.service.UsersService;
import com.hejiascm.util.LoginResultWrapper;
import com.hejiascm.util.VerifyCodeUtil;

@Controller  
public class LoginRestController {
	@Autowired
	UsersService userService;
	
	@Autowired
	RolesService roleService;
	
	@Autowired
	OrginfoService orginfoService;
	
    /** 
     * 获取验证码图片和文本(验证码文本会保存在HttpSession中) 
     */  
    @RequestMapping(value = "/VerifyCodeImage", method = RequestMethod.GET)
	@ResponseBody
    public void getVerifyCodeImage(HttpServletRequest request, HttpServletResponse response) throws IOException {  
        //设置页面不缓存  
        response.setHeader("Pragma", "no-cache");  
        response.setHeader("Cache-Control", "no-cache");  
        response.setDateHeader("Expires", 0);  
        String verifyCode = VerifyCodeUtil.generateTextCode(VerifyCodeUtil.TYPE_NUM_ONLY, 4, null);  
        //将验证码放到HttpSession里面  
        request.getSession().setAttribute("verifyCode", verifyCode);  
        System.out.println("本次生成的验证码为[" + verifyCode + "],已存放到HttpSession中");  
        //设置输出的内容的类型为JPEG图像  
        response.setContentType("image/jpeg");  
        BufferedImage bufferedImage = VerifyCodeUtil.generateImageCode(verifyCode, 90, 30, 3, true, Color.WHITE, Color.BLACK, null);  
        //写给浏览器  
        ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());  
    }
    
    
      
      
    /** 
     * 用户登录 
     */  
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
	@ResponseBody
    public Object login(@RequestBody Users users, HttpServletResponse res){ 
    	String authCode = null;
    	LoginResultWrapper result = new LoginResultWrapper();
        String username = users.getUsername();  
        System.out.println("The input user name: " + username);
        String password = users.getPassword();  
//        //获取HttpSession中的验证码  
//        String verifyCode = (String)request.getSession().getAttribute("verifyCode");  
//        //获取用户请求表单中输入的验证码  
//        String submitCode = WebUtils.getCleanParam(request, "verifyCode");  
//        System.out.println("用户[" + username + "]登录时输入的验证码为[" + submitCode + "],HttpSession中的验证码为[" + verifyCode + "]");  
//        if (StringUtils.isEmpty(submitCode) || !StringUtils.equals(verifyCode, submitCode.toLowerCase())){  
//            request.setAttribute("message_login", "验证码不正确");  
//            return resultPageURL;  
//        }  
        Subject currentUser = SecurityUtils.getSubject(); 
        UsernamePasswordToken token = null;
        if(!currentUser.isAuthenticated()){
	        System.out.println("The inputed username and password is" + username + ":" + password);
	        token = new UsernamePasswordToken(username, password);  
	        System.out.println("Token value: %%%%%%%%%%" + token);
	        
	        //Remember the user for future use
	        token.setRememberMe(true);  
	        System.out.println("为了验证登录用户而封装的token为" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));  
	        //获取当前的Subject  
	        
	        //System.out.println(currentUser.getPrincipal().toString());
	        try {  
	            //在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查  
	            //每个Realm都能在必要时对提交的AuthenticationTokens作出反应  
	            //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法  
	            System.out.println("对用户[" + username + "]进行登录验证..验证开始");  
	            currentUser.login(token);  
	        }catch(UnknownAccountException uae){  
	            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,未知账户");  
	            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED, "未知账户");
	        }catch(IncorrectCredentialsException ice){  
	            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");  
	            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED, "密码不正确");
	        }catch(LockedAccountException lae){  
	            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");  
	            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED, "账户已锁定");
	        }catch(ExcessiveAttemptsException eae){  
	            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");  
	            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED, "密码输入错误次数过多");
	        }catch(AuthenticationException ae){  
	            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景  
	            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");  
	            ae.printStackTrace();  
	            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED, "用户名或密码不正确");
	        }  
        }
        //验证是否登录成功 
        System.out.println(currentUser.isAuthenticated());
        if(currentUser.isAuthenticated()){  
            System.out.println("用户[" + username + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");  
            /**
             * 用户成功登录后返回前台所需信息
             */
            Users u = userService.findUserByUserName(currentUser.getPrincipal().toString());
            List<Roles> rs = roleService.findRolesByUserid(u.getUserid());
            List<String> roles = new ArrayList<String>();
            for(Roles r : rs){
            	roles.add(r.getRoleName());
            }
            Orginfo org = orginfoService.findOrginfoByPrimaryKey(u.getOrgid());
            
            /*
             * 按照Basic Authentication方式计算Base64编码返回给客户端 
             */
            byte[] encodedBytes = Base64.encodeBase64(new String(username + ":" + password).getBytes());
            authCode = new String(encodedBytes);
            System.out.println("AuthCode is: "+authCode);
            
            result.setRoleNames(roles);
            result.setUserid(u.getUserid());
            result.setOrgid(u.getOrgid());
            result.setOrgName(org.getName());
            result.setUsername(username);
            result.setFullName(u.getFullName());
            result.setAuthcode(authCode);    
        }else{  
            token.clear();  
        }  
        return result;  
    }  
      
      
    /** 
     * 用户登出 
     */  
    @RequestMapping("/logout")  
    public String logout(HttpServletRequest request){  
         SecurityUtils.getSubject().logout(); 
         return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/";  
    }  
}  
