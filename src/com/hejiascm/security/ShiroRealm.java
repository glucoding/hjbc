/**
 * 单一realm，区块链加入后可考虑针对区块链再做一个realm，两者通过AuthenticationStrategy配合使用
 * 第一层realm做用户名密码验证，第二层做区块链验证，两层均通过才算OK
 */
package com.hejiascm.security;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SaltedAuthenticationInfo;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authc.credential.Sha256CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.hejiascm.domain.Users;
import com.hejiascm.service.UsersService;

public class ShiroRealm extends AuthorizingRealm{
	@Autowired  
    private UsersService userService;  
  
    /** 
     * 授权操作 
     */  
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {  
//      String username = (String) getAvailablePrincipal(principals);  
        String username = (String) principals.getPrimaryPrincipal();  
          
//        Set<Role> roleSet =  userService.findUsersByUserName(username).getRoleSet();  
//        //角色名的集合  
//        Set<String> roles = new HashSet<String>();  
//        //权限名的集合  
//        Set<String> permissions = new HashSet<String>();  
//          
//        Iterator<Role> it = roleSet.iterator();  
//        while(it.hasNext()){  
//            roles.add(it.next().getName());  
//            for(Permission per:it.next().getPermissionSet()){  
//                permissions.add(per.getName());  
//            }  
//        }  
  
          
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();  
          
        //authorizationInfo.addRoles(roles);  
        //authorizationInfo.addStringPermissions(permissions);  
          
          
        return authorizationInfo;  
    }  
  
    /** 
     * 身份验证操作 
     */  
    @Override  
    protected AuthenticationInfo doGetAuthenticationInfo(  
            AuthenticationToken token) throws AuthenticationException {  
          
        String username = (String) token.getPrincipal();  
        Users user = userService.findUserByUserName(username);  
          
        if(user==null){  
            //木有找到用户  
            throw new UnknownAccountException("没有找到该账号");  
        }  
        /* if(Boolean.TRUE.equals(user.getLocked())) {   
                throw new LockedAccountException(); //帐号锁定   
            } */  
          
        /** 
         * 采用HashedCredentialsMatcher，生成用户时也只存密码的hash值和salt值   
         */  
        //SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(),getName());  
        Sha256CredentialsMatcher hash = new Sha256CredentialsMatcher();
        hash.setStoredCredentialsHexEncoded(false);
        hash.setHashSalted(false);
        //hash.setHashIterations(1024);
        setCredentialsMatcher(hash);
        
        
        System.out.println(user.getPassword() + ":" + user.getPasssalt());
        SaltedAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), /*ByteSource.Util.bytes(user.getPasssalt()),*/ getName());
        //System.out.println(info.getCredentialsSalt().toBase64());
        //System.out.println(info.getCredentials());
        //System.out.println(info.getCredentialsSalt());

        return info;  
    }  
    
    //使用Shiro session存储用户信息，rest无sesseion
//    private void setSession(Object key, Object value){  
//        Subject currentUser = SecurityUtils.getSubject();  
//        if(null != currentUser){  
//            Session session = currentUser.getSession();  
//            System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");  
//            if(null != session){  
//                session.setAttribute(key, value);  
//            }  
//        }  
//    }  
      
    @Override  
    public String getName() {  
        return getClass().getName();  
    }
}
