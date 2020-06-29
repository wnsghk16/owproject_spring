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

import com.legacy.myapp.domains.OWPlayerDTO;
import com.legacy.myapp.services.OWPlayerService;
import com.legacy.myapp.utils.Box;

@Controller
//@RestController
@RequestMapping("/owplayer")
public class OWPlayerController {
	private static final Logger logger = LoggerFactory.getLogger(OWPlayerController.class);

	@GetMapping("/list/form")
	public String join(Locale locale, Model model) {
		logger.info("----------------------owplayer--------------");		
		return "layout/owplayer.owplayer";
	}
	
//	@Autowired Box box;
//	@Autowired OWPlayerService owPlayerService;
//	
//	@GetMapping("/owteam")
//	public HashMap<String,Object> owplayers(){
//		box.clear();
//		List<OWPlayerDTO> list = owPlayerService.retriveAll();
//		box.put("list", list);
//		box.put("count", list.size());
//		return box.get();
//	}

}