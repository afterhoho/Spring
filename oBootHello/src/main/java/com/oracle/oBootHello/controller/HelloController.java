package com.oracle.oBootHello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.oBootHello.domain.Emp;

@Controller
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	// logger는 system message 처럼 뿌려줌 좀더 자세히 알려줌
	// Prefix -> templates
	// suffix -> .html
	// Mapping 의 hello는 string의 hello와 달라도 됨
	@RequestMapping("hello")
	public String hello(Model model) {
		System.out.println("hello start...");
		logger.info("start...");
		model.addAttribute("parameter","boot start...");
		// D/S --> V/R templates/ + hello + .html
		return "hello";
	}
	
	@ResponseBody
	@GetMapping("ajaxString")
	// 
	public String ajaxString(@RequestParam("ajaxName") String aName) {
		System.out.println("HelloController ajaxString aName->"+aName);
		return aName;
	}
	@ResponseBody
	@GetMapping("ajaxEmp")
	public Emp ajaxEmp(@RequestParam("empno")String empno,@RequestParam("ename")String ename) {
		System.out.println("HelloController ajaxEmp empno");
		logger.info("ename->{}",ename);
		Emp emp =new Emp();
		emp.setEmpno(empno);
		emp.setEname(ename);
		
		return emp;
	}

	
}
