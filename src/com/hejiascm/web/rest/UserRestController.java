package com.hejiascm.web.rest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hejiascm.blockchain.interfaces.UserDAO;
import com.hejiascm.domains.user._UserInfo;
import com.hejiascm.util.MiscTool;
import com.hejiascm.util.TimestampPropertyEditor;
import com.ibm.crl.bc.hejia.sdk.user.UserInfo;

@Controller("UserRestController")
public class UserRestController {
	@Autowired
	UserDAO userDAO;
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
		binder.registerCustomEditor(Timestamp.class,new TimestampPropertyEditor());
	}
	
	/**
	 * Block chain(CU)
	 * Register new organization or change the values of existing organization
	 * @param User
	 * @return void
	 */
	@RequestMapping(value = "/bcUser", method = RequestMethod.POST)
	@ResponseBody
	public UserInfo addUser(@RequestBody _UserInfo u, HttpServletRequest request, HttpServletResponse response) {
		UserInfo uinfo = userDAO.add(u, MiscTool.getBase64Name(request.getHeader("Authorization").trim()));
		
		if(uinfo!= null)
			return uinfo;
		else{
			//response.setStatus(499);
			return null;
		}
	}
	
	@RequestMapping(value = "/bcUser/update", method = RequestMethod.POST)
	@ResponseBody
	public UserInfo updateUser(@RequestBody _UserInfo u, HttpServletRequest request, HttpServletResponse response) {
		UserInfo uinfo = userDAO.update(u, MiscTool.getBase64Name(request.getHeader("Authorization").trim()));
		
		if(uinfo!= null)
			return uinfo;
		else{
			//response.setStatus(499);
			return null;
		}
	}

	/**
	 * Block chain(Rid)
	 * @param id
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcUser/{orgId}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public _UserInfo[] loadAll(@PathVariable String orgId,  HttpServletRequest request, HttpServletResponse response) {
		_UserInfo[] us = userDAO.getAll(orgId, MiscTool.getBase64Name(request.getHeader("Authorization").trim()) );
		if(us!= null){
			return us;
		}else{
			//response.setStatus(499);
			return new _UserInfo[0];
		}
	}
	
	/**
	 * Block chain(Rid)
	 * @param id
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcUser/{orgId}/{name}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public _UserInfo loadOne(@PathVariable String orgId, @PathVariable String name, HttpServletRequest request, HttpServletResponse response) {
		_UserInfo u = userDAO.getOne(orgId, name, MiscTool.getBase64Name(request.getHeader("Authorization").trim()) );
		if(u != null){
			return u;
		}else{
			//response.setStatus(499);
			return null;
		}
	}
	
	@RequestMapping(value = "/bcUser/{orgId}/{name}", method = RequestMethod.DELETE, produces="application/json;charset=UTF-8")
	@ResponseBody
	public void delUser(@PathVariable String orgId, @PathVariable String name, HttpServletRequest request) {
		userDAO.delete(orgId, MiscTool.getBase64Email(name), MiscTool.getBase64Name(request.getHeader("Authorization").trim()));
	}
}
