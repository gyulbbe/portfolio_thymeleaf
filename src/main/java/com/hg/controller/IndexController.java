package com.hg.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {


//	Logger logger = Logger.getLogger(MemberController.class);

	@RequestMapping("/index.do")
	public ModelAndView index(@RequestParam HashMap<String, String> params) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/profile.do")
	public ModelAndView profile(@RequestParam HashMap<String, String> params) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("profile");
		return mv;
	}

	@RequestMapping("/home.do")
	public ModelAndView home(@RequestParam HashMap<String, String> params) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/admin.do")
	public ModelAndView admin(@RequestParam HashMap<String, Object> params) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("/admin/memberList");
		return mv;
	}


	@RequestMapping("/devNotes.do")
	public ModelAndView tables(@RequestParam HashMap<String, String> params) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("devNotes");

		return mv;
	}
}
