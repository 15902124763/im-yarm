package com.yarm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("page")
@Controller
public class ToPageController {

	@RequestMapping("massage")
	public String toMassage(){
		return "page/massage";
	}
}
