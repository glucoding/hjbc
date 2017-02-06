package com.hejiascm.web;

import com.hejiascm.dao.PermissionsDAO;

import com.hejiascm.domain.Permissions;

import com.hejiascm.service.PermissionsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Permissions entities
 * 
 */

@Controller("PermissionsController")
public class PermissionsController {

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
	 * Delete an existing Permissions entity
	 * 
	 */
	@RequestMapping("/deletePermissions")
	public String deletePermissions(@RequestParam String permissionidKey) {
		Permissions permissions = permissionsDAO.findPermissionsByPrimaryKey(permissionidKey);
		permissionsService.deletePermissions(permissions);
		return "forward:/indexPermissions";
	}

	/**
	 * Entry point to show all Permissions entities
	 * 
	 */
	public String indexPermissions() {
		return "redirect:/indexPermissions";
	}

	/**
	 */
	@RequestMapping("/permissionsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Permissions entity
	 * 
	 */
	@RequestMapping("/newPermissions")
	public ModelAndView newPermissions() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("permissions", new Permissions());
		mav.addObject("newFlag", true);
		mav.setViewName("permissions/editPermissions.jsp");

		return mav;
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
	 * Show all Permissions entities
	 * 
	 */
	@RequestMapping("/indexPermissions")
	public ModelAndView listPermissionss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("permissionss", permissionsService.loadPermissionss());

		mav.setViewName("permissions/listPermissionss.jsp");

		return mav;
	}

	/**
	 * Select the Permissions entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePermissions")
	public ModelAndView confirmDeletePermissions(@RequestParam String permissionidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("permissions", permissionsDAO.findPermissionsByPrimaryKey(permissionidKey));
		mav.setViewName("permissions/deletePermissions.jsp");

		return mav;
	}

	/**
	 * Select an existing Permissions entity
	 * 
	 */
	@RequestMapping("/selectPermissions")
	public ModelAndView selectPermissions(@RequestParam String permissionidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("permissions", permissionsDAO.findPermissionsByPrimaryKey(permissionidKey));
		mav.setViewName("permissions/viewPermissions.jsp");

		return mav;
	}

	/**
	 * Save an existing Permissions entity
	 * 
	 */
	@RequestMapping("/savePermissions")
	public String savePermissions(@ModelAttribute Permissions permissions) {
		permissionsService.savePermissions(permissions);
		return "forward:/indexPermissions";
	}

	/**
	 * Edit an existing Permissions entity
	 * 
	 */
	@RequestMapping("/editPermissions")
	public ModelAndView editPermissions(@RequestParam String permissionidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("permissions", permissionsDAO.findPermissionsByPrimaryKey(permissionidKey));
		mav.setViewName("permissions/editPermissions.jsp");

		return mav;
	}
}