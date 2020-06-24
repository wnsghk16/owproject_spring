package com.legacy.myapp.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legacy.myapp.domains.OWTeamDTO;
import com.legacy.myapp.services.OWTeamService;
import com.legacy.myapp.utils.Box;

//@RestController
//@RequestMapping
@Controller
public class OWTeamController {
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
