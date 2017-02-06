package com.hejiascm.web.rest;

import com.hejiascm.dao.UsersDAO;
import com.hejiascm.domain.Users;
import com.hejiascm.service.UsersService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Users entities
 * 
 */

@Controller("UsersRestController")
public class UsersRestController {

	/**
	 * DAO injected by Spring that manages Users entities
	 * 
	 */
	@Autowired
	private UsersDAO usersDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Users entities
	 * 
	 */
	@Autowired
	private UsersService usersService;

	/**
	 * Show all Users entities
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.GET)
	@ResponseBody
	public List<Users> listUserss() {
		return new java.util.ArrayList<Users>(usersService.loadUserss());
	}

	/**
	 * Save an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.PUT)
	@ResponseBody
	public Users saveUsers(@RequestBody Users users) {
		usersService.saveUsers(users);
		return usersDAO.findUsersByPrimaryKey(users.getUserid());
	}

	/**
	 * Select an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_userid}", method = RequestMethod.GET)
	@ResponseBody
	public Users loadUsers(@PathVariable String users_userid) {
		return usersDAO.findUsersByPrimaryKey(users_userid);
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Delete an existing Users entity
	 * 
	 */
	@RequestMapping(value = "/Users/{users_userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUsers(@PathVariable String users_userid) {
		Users users = usersDAO.findUsersByPrimaryKey(users_userid);
		usersService.deleteUsers(users);
	}

	/**
	 * Create a new Users entity
	 * 
	 */
	@RequestMapping(value = "/Users", method = RequestMethod.POST)
	@ResponseBody
	public Users newUsers(@RequestBody Users users) {
		//判断用户名是否已经存在
		Users u = (Users)usersDAO.findUsersByUsername(users.getUsername());
		if(u != null){
			return null;
		}
		//为用户生成初始密码并转hash值
		String plainTextPassword = "123456";
		RandomNumberGenerator rng = new SecureRandomNumberGenerator();
		ByteSource salt = rng.nextBytes();
		String stringSalt = salt.toBase64();

		//Now hash the plain-text password with the random salt and multiple 
		//iterations and then Base64-encode the value (requires less space than Hex): 				String hashedPasswordBase64 = new Sha256Hash(plainTextPassword, salt, 1024).toBase64();
		//String hashedPasswordBase64 = new Sha256Hash(plainTextPassword, salt, 1024).toBase64();
		//String hashedPasswordBase64 = new Sha256Hash(plainTextPassword, salt, 1024).toBase64();
		String hashedPasswordBase64 = new Sha256Hash(plainTextPassword).toBase64();
		
		users.setPassword(hashedPasswordBase64);
		System.out.println(hashedPasswordBase64);
		users.setPasssalt(stringSalt);

		usersService.saveUsers(users);
		return (Users) usersDAO.findUsersByUsername(users.getUsername());
	}
}