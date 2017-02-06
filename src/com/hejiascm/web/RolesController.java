package com.hejiascm.web;

import com.hejiascm.dao.RolesDAO;

import com.hejiascm.domain.Roles;

import com.hejiascm.service.RolesService;

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
 * Spring MVC controller that handles CRUD requests for Roles entities
 * 
 */

@Controller("RolesController")
public class RolesController {

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
	 * Select an existing Roles entity
	 * 
	 */
	@RequestMapping("/selectRoles")
	public ModelAndView selectRoles(@RequestParam String roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roles", rolesDAO.findRolesByPrimaryKey(roleidKey));
		mav.setViewName("roles/viewRoles.jsp");

		return mav;
	}

	/**
	 * Select the Roles entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRoles")
	public ModelAndView confirmDeleteRoles(@RequestParam String roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roles", rolesDAO.findRolesByPrimaryKey(roleidKey));
		mav.setViewName("roles/deleteRoles.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/rolesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Roles entity
	 * 
	 */
	@RequestMapping("/deleteRoles")
	public String deleteRoles(@RequestParam String roleidKey) {
		Roles roles = rolesDAO.findRolesByPrimaryKey(roleidKey);
		rolesService.deleteRoles(roles);
		return "forward:/indexRoles";
	}

	/**
	 * Show all Roles entities
	 * 
	 */
	@RequestMapping("/indexRoles")
	public ModelAndView listRoless() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roless", rolesService.loadRoless());

		mav.setViewName("roles/listRoless.jsp");

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
	 * Create a new Roles entity
	 * 
	 */
	@RequestMapping("/newRoles")
	public ModelAndView newRoles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roles", new Roles());
		mav.addObject("newFlag", true);
		mav.setViewName("roles/editRoles.jsp");

		return mav;
	}

	/**
	 * Save an existing Roles entity
	 * 
	 */
	@RequestMapping("/saveRoles")
	public String saveRoles(@ModelAttribute Roles roles) {
		rolesService.saveRoles(roles);
		return "forward:/indexRoles";
	}

	/**
	 * Entry point to show all Roles entities
	 * 
	 */
	public String indexRoles() {
		return "redirect:/indexRoles";
	}

	/**
	 * Edit an existing Roles entity
	 * 
	 */
	@RequestMapping("/editRoles")
	public ModelAndView editRoles(@RequestParam String roleidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("roles", rolesDAO.findRolesByPrimaryKey(roleidKey));
		mav.setViewName("roles/editRoles.jsp");

		return mav;
	}
}