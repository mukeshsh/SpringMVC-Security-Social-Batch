package com.nt.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

public class TestController {
	@Autowired
  private ServletContext sc;
	@Autowired
  private ServletConfig cg;
	
	public String showHomePage1(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("TestController.showHomePage1()");
		System.out.println(sc.getClass());
		System.out.println(cg.getClass());
		System.out.println(req.getClass());
		System.out.println(res.getClass());
		return "home_page";
	}
}
