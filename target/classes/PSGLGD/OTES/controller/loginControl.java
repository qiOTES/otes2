package PSGLGD.OTES.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import PSGLGD.OTES.entity.ActiveUser;
import PSGLGD.OTES.service.userService;
@Controller
public class loginControl {
	@Autowired
	public userService userservice;
	@RequestMapping("/login")
	public String login(String userid,String password,HttpSession session)throws Exception{
		ActiveUser activeuser=userservice.authenticat(userid, password);
		session.setAttribute("activeuser",activeuser);
		return "main/ui";
	}
}
