package com.legacy.myapp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legacy.myapp.domains.OWTeamDTO;
import com.legacy.myapp.services.OWTeamService;
import com.legacy.myapp.utils.Box;

//@RestController
@Controller
@RequestMapping("/owteam")
public class OWTeamController {
	private static final Logger logger = LoggerFactory.getLogger(OWTeamController.class);

	@GetMapping("/list/form")
	public String join(Locale locale, Model model) {
		logger.info("----------------------owteam--------------");		
		return "layout/owteam.owteam";
	}
//	@Autowired Box box;
//	@Autowired OWTeamService owTeamService;
//	
//	@GetMapping("/owteam")
//	public HashMap<String,Object> owteams(){
//		List<OWTeamDTO> list = owTeamService.retriveAll();
//		box.put("list", list);
//		box.put("count", list.size());
//		return box.get();
//	}
}
