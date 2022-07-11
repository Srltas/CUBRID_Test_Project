package com.cubrid.test.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cubrid.test.domain.Athlete;
import com.cubrid.test.service.athlete.AthleteService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/test")
public class AthleteApiController {
	
	private final AthleteService athleteService;
	
	@GetMapping("/list")
	public String findAll(Model model) {
		List<Athlete> athleteList = athleteService.findAll();
		
		model.addAttribute("athleteList", athleteList);
		
		return "athlete/list-athlete";
	}
	
	@GetMapping
	public String test() {
		return "test";
	}
}
