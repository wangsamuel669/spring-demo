package xyz.samuelwang.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() {
		return "左天这个大帅逼！！！";
	}
}
