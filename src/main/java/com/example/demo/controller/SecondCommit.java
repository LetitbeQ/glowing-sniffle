package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondCommit {
	@RequestMapping("/sec")
	@ResponseBody	
	public String doSth(){
		 return  "Second Commit！";
	}
}
