package com.arq.lytmus.controllers;

import com.arq.lytmus.services.ILoginService;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private ILoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(@RequestBody JsonNode payload) {
		loginService.login(payload);
	}

	@RequestMapping("/hello")
	public ModelAndView home(ModelAndView mnv) throws Exception {
		mnv.setViewName("home");
		mnv.addObject("name", "Sumit");
		return mnv;

	}


}

