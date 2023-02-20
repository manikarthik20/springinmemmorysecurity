package com.example.basicauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inMemmory")
public class InMemmory {
	
	@GetMapping("/welcome")
	public String welcome() {
		String msg = "Hi Welcome to Ojas";
		return msg;
	}
	
	@GetMapping("/home")
	public String home() {
		String msg = "Hi Welcome to Home";
		return msg;
	}
	
	
	@GetMapping("/paersonal")
	public String personal() {
		String msg = "Hi Welcome to personal";
		return msg;
	}
	
	@GetMapping("/orders")
	public String orders() {
		String msg = "This is contact orders";
		return msg;
	}
	
	@GetMapping("/wallet")
	public String wallet() {
		String msg = "This is contact wallet";
		return msg;
	}
	
	
	@GetMapping("/contactUs")
	public String contact() {
		String msg = "This is contact contactus";
		return msg;
	}
	
	@GetMapping("/aboutUs")
	public String about() {
		String msg = "This is about aboutus";
		return msg;
	}
	
	@GetMapping("/mobiles")
	public String mobiles() {
		String msg = "This is about mobiles";
		return msg;
	}
	
	@GetMapping("/user")
	public String getdata() {
		String msg = "This is user dashbord";
		return msg;
	}
	
	@GetMapping("/accessDenied")
	public String accessDenied() {
		String msg = "This is contact accessDenied";
		return msg;
	}
	

}
