package com.hejiascm.web.rest;

import com.hejiascm.dao.RolesDAO;

import com.hejiascm.domain.Roles;

import com.hejiascm.service.RolesService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
 * Spring Rest controller that handles CRUD requests for Roles entities
 * 
 */

@Controller("RolesRestController")
public class RolesRestController {

	/**
	 * DAO injected by Spring that manages Roles entities
	 * 
	 */
	@Autowired
	private RolesDAO rolesDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Roles entities
	 * 
	 */
	@Autowired
	private RolesService rolesService;

	/**
	 * Create a new Roles entity
	 * 
	 */
	@RequestMapping(value = "/Roles", method = RequestMethod.POST)
	@ResponseBody
	public Roles newRoles(@RequestBody Roles roles) {
		rolesService.saveRoles(roles);
		return rolesDAO.findRolesByPrimaryKey(roles.getRoleid());
	}

	/**
	 * Save an existing Roles entity
	 * 
	 */
	@RequestMapping(value = "/Roles", method = RequestMethod.PUT)
	@ResponseBody
	public Roles saveRoles(@RequestBody Roles roles) {
		rolesService.saveRoles(roles);
		return rolesDAO.findRolesByPrimaryKey(roles.getRoleid());
	}

	/**
	 * Select an existing Roles entity
	 * 
	 */
	@RequestMapping(value = "/Roles/{roles_roleid}", method = RequestMethod.GET)
	@ResponseBody
	public Roles loadRoles(@PathVariable String roles_roleid) {
		return rolesDAO.findRolesByPrimaryKey(roles_roleid);
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
	 * Delete an existing Roles entity
	 * 
	 */
	@RequestMapping(value = "/Roles/{roles_roleid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRoles(@PathVariable String roles_roleid) {
		Roles roles = rolesDAO.findRolesByPrimaryKey(roles_roleid);
		rolesService.deleteRoles(roles);
	}

	/**
	 * Show all Roles entities
	 * 
	 */
	@RequestMapping(value = "/Roles", method = RequestMethod.GET)
	@ResponseBody
	public List<Roles> listRoless() {
		return new java.util.ArrayList<Roles>(rolesService.loadRoless());
	}
}