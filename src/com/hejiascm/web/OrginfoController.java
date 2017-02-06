package com.hejiascm.web;

import com.hejiascm.dao.BankaccountinfoDAO;
import com.hejiascm.dao.OrginfoDAO;
import com.hejiascm.dao.OrginfoattachmentDAO;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;

import com.hejiascm.service.OrginfoService;

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
 * Spring MVC controller that handles CRUD requests for Orginfo entities
 * 
 */

@Controller("OrginfoController")
public class OrginfoController {

	/**
	 * DAO injected by Spring that manages Bankaccountinfo entities
	 * 
	 */
	@Autowired
	private BankaccountinfoDAO bankaccountinfoDAO;

	/**
	 * DAO injected by Spring that manages Orginfo entities
	 * 
	 */
	@Autowired
	private OrginfoDAO orginfoDAO;

	/**
	 * DAO injected by Spring that manages Orginfoattachment entities
	 * 
	 */
	@Autowired
	private OrginfoattachmentDAO orginfoattachmentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Orginfo entities
	 * 
	 */
	@Autowired
	private OrginfoService orginfoService;

	/**
	 * Edit an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/editOrginfo")
	public ModelAndView editOrginfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", orginfoDAO.findOrginfoByPrimaryKey(idKey));
		mav.setViewName("orginfo/editOrginfo.jsp");

		return mav;
	}

	/**
	 * Select the child Bankaccountinfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrginfoBankaccountinfos")
	public ModelAndView confirmDeleteOrginfoBankaccountinfos(@RequestParam String orginfo_id, @RequestParam String related_bankaccountinfos_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountinfo", bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(related_bankaccountinfos_id));
		mav.addObject("orginfo_id", orginfo_id);
		mav.setViewName("orginfo/bankaccountinfos/deleteBankaccountinfos.jsp");

		return mav;
	}

	/**
	 * Create a new Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/newOrginfoBankaccountinfos")
	public ModelAndView newOrginfoBankaccountinfos(@RequestParam String orginfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("bankaccountinfo", new Bankaccountinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("orginfo/bankaccountinfos/editBankaccountinfos.jsp");

		return mav;
	}

	/**
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/saveOrginfoBankaccountinfos")
	public ModelAndView saveOrginfoBankaccountinfos(@RequestParam String orginfo_id, @ModelAttribute Bankaccountinfo bankaccountinfos) {
		Orginfo parent_orginfo = orginfoService.saveOrginfoBankaccountinfos(orginfo_id, bankaccountinfos);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("orginfo", parent_orginfo);
		mav.setViewName("orginfo/viewOrginfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/editOrginfoBankaccountinfos")
	public ModelAndView editOrginfoBankaccountinfos(@RequestParam String orginfo_id, @RequestParam String bankaccountinfos_id) {
		Bankaccountinfo bankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfos_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("bankaccountinfo", bankaccountinfo);
		mav.setViewName("orginfo/bankaccountinfos/editBankaccountinfos.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orginfoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/deleteOrginfoBankaccountinfos")
	public ModelAndView deleteOrginfoBankaccountinfos(@RequestParam String orginfo_id, @RequestParam String related_bankaccountinfos_id) {
		ModelAndView mav = new ModelAndView();

		Orginfo orginfo = orginfoService.deleteOrginfoBankaccountinfos(orginfo_id, related_bankaccountinfos_id);

		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("orginfo", orginfo);
		mav.setViewName("orginfo/viewOrginfo.jsp");

		return mav;
	}

	/**
	 * Select the Orginfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrginfo")
	public ModelAndView confirmDeleteOrginfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", orginfoDAO.findOrginfoByPrimaryKey(idKey));
		mav.setViewName("orginfo/deleteOrginfo.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Orginfo entities
	 * 
	 */
	public String indexOrginfo() {
		return "redirect:/indexOrginfo";
	}

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/deleteOrginfoOrginfoattachments")
	public ModelAndView deleteOrginfoOrginfoattachments(@RequestParam String orginfo_id, @RequestParam String related_orginfoattachments_id) {
		ModelAndView mav = new ModelAndView();

		Orginfo orginfo = orginfoService.deleteOrginfoOrginfoattachments(orginfo_id, related_orginfoattachments_id);

		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("orginfo", orginfo);
		mav.setViewName("orginfo/viewOrginfo.jsp");

		return mav;
	}

	/**
	 * Show all Orginfoattachment entities by Orginfo
	 * 
	 */
	@RequestMapping("/listOrginfoOrginfoattachments")
	public ModelAndView listOrginfoOrginfoattachments(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", orginfoDAO.findOrginfoByPrimaryKey(idKey));
		mav.setViewName("orginfo/orginfoattachments/listOrginfoattachments.jsp");

		return mav;
	}

	/**
	 * Save an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/saveOrginfoOrginfoattachments")
	public ModelAndView saveOrginfoOrginfoattachments(@RequestParam String orginfo_id, @ModelAttribute Orginfoattachment orginfoattachments) {
		Orginfo parent_orginfo = orginfoService.saveOrginfoOrginfoattachments(orginfo_id, orginfoattachments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("orginfo", parent_orginfo);
		mav.setViewName("orginfo/viewOrginfo.jsp");

		return mav;
	}

	/**
	 * Show all Bankaccountinfo entities by Orginfo
	 * 
	 */
	@RequestMapping("/listOrginfoBankaccountinfos")
	public ModelAndView listOrginfoBankaccountinfos(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", orginfoDAO.findOrginfoByPrimaryKey(idKey));
		mav.setViewName("orginfo/bankaccountinfos/listBankaccountinfos.jsp");

		return mav;
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/deleteOrginfo")
	public String deleteOrginfo(@RequestParam String idKey) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(idKey);
		orginfoService.deleteOrginfo(orginfo);
		return "forward:/indexOrginfo";
	}

	/**
	 * Create a new Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/newOrginfoOrginfoattachments")
	public ModelAndView newOrginfoOrginfoattachments(@RequestParam String orginfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("orginfoattachment", new Orginfoattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("orginfo/orginfoattachments/editOrginfoattachments.jsp");

		return mav;
	}

	/**
	 * Select an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/selectOrginfo")
	public ModelAndView selectOrginfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", orginfoDAO.findOrginfoByPrimaryKey(idKey));
		mav.setViewName("orginfo/viewOrginfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/editOrginfoOrginfoattachments")
	public ModelAndView editOrginfoOrginfoattachments(@RequestParam String orginfo_id, @RequestParam String orginfoattachments_id) {
		Orginfoattachment orginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("orginfoattachment", orginfoattachment);
		mav.setViewName("orginfo/orginfoattachments/editOrginfoattachments.jsp");

		return mav;
	}

	/**
	 * View an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/selectOrginfoBankaccountinfos")
	public ModelAndView selectOrginfoBankaccountinfos(@RequestParam String orginfo_id, @RequestParam String bankaccountinfos_id) {
		Bankaccountinfo bankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfos_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("bankaccountinfo", bankaccountinfo);
		mav.setViewName("orginfo/bankaccountinfos/viewBankaccountinfos.jsp");

		return mav;
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/saveOrginfo")
	public String saveOrginfo(@ModelAttribute Orginfo orginfo) {
		orginfoService.saveOrginfo(orginfo);
		return "forward:/indexOrginfo";
	}

	/**
	 * Select the child Orginfoattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrginfoOrginfoattachments")
	public ModelAndView confirmDeleteOrginfoOrginfoattachments(@RequestParam String orginfo_id, @RequestParam String related_orginfoattachments_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfoattachment", orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(related_orginfoattachments_id));
		mav.addObject("orginfo_id", orginfo_id);
		mav.setViewName("orginfo/orginfoattachments/deleteOrginfoattachments.jsp");

		return mav;
	}

	/**
	 * View an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/selectOrginfoOrginfoattachments")
	public ModelAndView selectOrginfoOrginfoattachments(@RequestParam String orginfo_id, @RequestParam String orginfoattachments_id) {
		Orginfoattachment orginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfo_id", orginfo_id);
		mav.addObject("orginfoattachment", orginfoattachment);
		mav.setViewName("orginfo/orginfoattachments/viewOrginfoattachments.jsp");

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
	 * Show all Orginfo entities
	 * 
	 */
	@RequestMapping("/indexOrginfo")
	public ModelAndView listOrginfos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfos", orginfoService.loadOrginfos());

		mav.setViewName("orginfo/listOrginfos.jsp");

		return mav;
	}

	/**
	 * Create a new Orginfo entity
	 * 
	 */
	@RequestMapping("/newOrginfo")
	public ModelAndView newOrginfo() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", new Orginfo());
		mav.addObject("newFlag", true);
		mav.setViewName("orginfo/editOrginfo.jsp");

		return mav;
	}
}