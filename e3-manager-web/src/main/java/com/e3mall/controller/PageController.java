package com.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e3mall.service.ItemService;

@Controller
public class PageController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public String getItemById() {
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String getItemById(@PathVariable String page) {
		return page;
	}

}
