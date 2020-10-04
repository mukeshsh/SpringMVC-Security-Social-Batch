package com.nt.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.dto.StudentDTO;


@Controller
public class DataRenderingController {
   
	  @GetMapping("/welcome")
	  public String processData(Model model) { //preare
	   List<StudentDTO> listDTO=List.of(new StudentDTO(101,"raja","hyd",78.78f),
	                                                                 new StudentDTO(102,"rajesh","vizag",78.79f), 
	                                                                 new StudentDTO(103,"suresh","delhi",78.80f) );
	  //add to mode attribute 
	   model.addAttribute("studList",listDTO); 
	   return"display"; }
	 
	/*@GetMapping("/welcome")
	 public String     processData(Model model) {
	 String names[]=new String[] {"raja","rani","suresh","mahesh"};
	 List<String> fruitsList=List.of("apple","banana","grapes","cherries");  //java 9 .. immutable List 
	 Set<Long> phonesSet=Set.of(999999L,888888L,77777L);  //java 9 .. immutable List 
	 Map<String,Integer> ageMap=Map.of("raja",30,"rani",31,"suresh",40);
	 //add them as model attributes
	 model.addAttribute("namesInfo",names);
	 model.addAttribute("fruitsInfo",fruitsList);
	 model.addAttribute("phonesInfo",phonesSet);
	 model.addAttribute("agesInfo",ageMap);
	 
	 return "display";
}*/
}