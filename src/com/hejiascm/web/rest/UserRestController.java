package com.hejiascm.web.rest;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hejiascm.blockchain.BcUserDAO;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.User;
import com.hejiascm.util.TimestampPropertyEditor;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;

@Controller("UserRestController")
public class UserRestController {
	@Autowired
	BcUserDAO bcUserDAO;
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
	public void addUser(@RequestBody User u, HttpServletResponse res) {
		int result = bcUserDAO.bcAdd(u);
		if(result == 0){
			res.setStatus(450);
		}
	}

	/**
	 * Block chain(Rid)
	 * @param id
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcUser/{orgId}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<com.hejiascm.domain.User> loadAll(@PathVariable String orgId) {
		return bcUserDAO.bcGetAll(orgId);
	}
	
	/**
	 * Block chain(Rid)
	 * @param id
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcUser/{orgId}/{name}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public com.hejiascm.domain.User loadOne(@PathVariable String orgId, @PathVariable String name) {
		return bcUserDAO.bcGetOne(orgId, name);
	}
}
