package com.ssb.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("member.memberController")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping(value="")
	public String login() {
		return "";
	}
	

}
