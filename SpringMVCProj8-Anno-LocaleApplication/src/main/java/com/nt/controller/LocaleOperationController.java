package com.nt.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.ILocaleInfoService;

@Controller
public class LocaleOperationController {
   
	@Autowired
	private ILocaleInfoService service;
	
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public String showHomePage() {
		return "home";
	}
	public String viewData() {
		System.out.println("LocaleOperationController.viewData()");
		return "home_page";
	}
	/*	@RequestMapping(value="/countries",method=RequestMethod.GET)
		public ModelAndView  fetchCountries() {
			Set<String> countriesList=null;
			ModelAndView mav=null;
			//use Service
			countriesList=service.getAllCountries();
			//return MAV
			mav=new ModelAndView();
			//adding multiple model attribues
			mav.addObject("listInfo", countriesList);
			mav.addObject("operation", "countries");
			mav.addObject("countriesCount", countriesList.size());
			//adding lvn
			mav.setViewName("show_results");
			return mav;
	}*/
	
	/*@RequestMapping(value = "/countries/add",method=RequestMethod.GET)
	public Map<String, Object> fetchCounries(){
		Set<String> countriesList=null;
		Map<String,Object> map=new HashMap();
		//use service
		countriesList=service.getAllCountries();
		//adding multiple model attributes
		map.put("listInfo", countriesList);
		map.put("operation", "countries");
		map.put("countriesCount",countriesList.size());
		return map;
	}*/
	
	/*@RequestMapping(value="/countries",method=RequestMethod.GET)
	public String  fetchCountries(Map<String,Object> map) {
		Set<String> countriesList=null;
		//use Service
		countriesList=service.getAllCountries();
		//return MAV
		//adding multiple model attribues
		map.put("listInfo", countriesList);
		map.put("operation", "countries");
		map.put("countriesCount", countriesList.size());
		//return lvn
		return "show_results";
	}*/
	
	/*@RequestMapping(value="/countries",method=RequestMethod.GET)
	public String  fetchCountries(ModelMap map) {
		Set<String> countriesList=null;
		//use Service
		countriesList=service.getAllCountries();
		//return MAV
		//adding multiple model attribues
		map.put("listInfo", countriesList);
		map.put("operation", "countries");
		map.put("countriesCount", countriesList.size());
		//return lvn
		return "show_results";	
	}*/

	/*@RequestMapping(value="/countries",method=RequestMethod.GET)
	public String  fetchCountries(Model model) {
		Set<String> countriesList=null;
		//use Service
		countriesList=service.getAllCountries();
		//return MAV
		//adding multiple model attribues
		model.addAttribute("listInfo", countriesList);
		model.addAttribute("operation", "countries");
		model.addAttribute("countriesCount", countriesList.size());
		//return lvn
		return "show_results";	
	}*/
	@RequestMapping(value="/countries",method=RequestMethod.GET)
	public void  fetchCountries(ModelAndView mav) {
		Set<String> countriesList=null;
		//use Service
		countriesList=service.getAllCountries();
		//adding multiple model attribues
		mav.addObject("listInfo", countriesList);
		mav.addObject("operation", "countries");
		mav.addObject("countriesCount", countriesList.size());
		mav.setViewName("show_results");
      }
}
