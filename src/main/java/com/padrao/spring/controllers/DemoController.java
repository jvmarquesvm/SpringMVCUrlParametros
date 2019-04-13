package com.padrao.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("demo")
public class DemoController {
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "demo/index";
	}
	
	@RequestMapping(value = "hi/{fullname}", method = RequestMethod.GET)
	public String hi(@PathVariable("fullname") String fullname, ModelMap modelMap) {
		modelMap.put("result", "Hi " + fullname);
		return "demo/result";
	}
	
	@RequestMapping(value = "sum/{a}/{b}", method = RequestMethod.GET)
	public String sum(@PathVariable("a") int a, @PathVariable("b") int b, ModelMap modelMap) {
		modelMap.put("result", "Sum " + (a + b));
		return "demo/result";
	}
}
