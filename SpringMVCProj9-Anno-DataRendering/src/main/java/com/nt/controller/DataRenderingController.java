package com.nt.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DataRenderingController {

	/*@GetMapping("/welcome")
	 public String     processData(Model model) {
	 System.out.println("DataRenderingController.processData()"+model.getClass());
	 model.addAttribute("msg","welcome").addAttribute("sysDate", new Date());
	 return "display";
	 }*/

	/*@GetMapping("/welcome")
	public String processData(Map<String,Object> map) {
		System.out.println("DataRenderingController.processData()"+map.getClass());
		map.put("msg", "welcome");
		System.out.println("size of"+map.size());
		return"display";
	}*/
	@GetMapping("/welcome")
	public String processData(ModelMap map) {
		System.out.println("DataRenderingController.processData()"+map.getClass());
		map.addAttribute("msg", "welcome").addAttribute("sysDate",new Date());
		System.out.println("size of"+map.size());
		return"display";
	}

}
