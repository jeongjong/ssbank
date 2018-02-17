package com.ssb.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("member.memberController")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	

}
