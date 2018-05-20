package com.mm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
	@RequestMapping(value = "/test")
	public String get() {
		return "index";
	}
}
