package com.hejiascm.web.rest;

import com.hejiascm.dao.PermissionsDAO;

import com.hejiascm.domain.Permissions;

import com.hejiascm.service.PermissionsService;

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
 * Spring Rest controller that handles CRUD requests for Permissions entities
 * 
 */

@Controller("PermissionsRestController")
public class PermissionsRestController {

	/**
	 * DAO injected by Spring that manages Permissions entities
	 * 
	 */
	@Autowired
	private PermissionsDAO permissionsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Permissions entities
	 * 
	 */
	@Autowired
	private PermissionsService permissionsService;

	/**
	 * Select an existing Permissions entity
	 * 
	 */
	@RequestMapping(value = "/Permissions/{permissions_permissionid}", method = RequestMethod.GET)
	@ResponseBody
	public Permissions loadPermissions(@PathVariable String permissions_permissionid) {
		return permissionsDAO.findPermissionsByPrimaryKey(permissions_permissionid);
	}

	/**
	 * Save an existing Permissions entity
	 * 
	 */
	@RequestMapping(value = "/Permissions", method = RequestMethod.PUT)
	@ResponseBody
	public Permissions savePermissions(@RequestBody Permissions permissions) {
		permissionsService.savePermissions(permissions);
		return permissionsDAO.findPermissionsByPrimaryKey(permissions.getPermissionid());
	}

	/**
	 * Delete an existing Permissions entity
	 * 
	 */
	@RequestMapping(value = "/Permissions/{permissions_permissionid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePermissions(@PathVariable String permissions_permissionid) {
		Permissions permissions = permissionsDAO.findPermissionsByPrimaryKey(permissions_permissionid);
		permissionsService.deletePermissions(permissions);
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
	 * Create a new Permissions entity
	 * 
	 */
	@RequestMapping(value = "/Permissions", method = RequestMethod.POST)
	@ResponseBody
	public Permissions newPermissions(@RequestBody Permissions permissions) {
		permissionsService.savePermissions(permissions);
		return permissionsDAO.findPermissionsByPrimaryKey(permissions.getPermissionid());
	}

	/**
	 * Show all Permissions entities
	 * 
	 */
	@RequestMapping(value = "/Permissions", method = RequestMethod.GET)
	@ResponseBody
	public List<Permissions> listPermissionss() {
		return new java.util.ArrayList<Permissions>(permissionsService.loadPermissionss());
	}
}