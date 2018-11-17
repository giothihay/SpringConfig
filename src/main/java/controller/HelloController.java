package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String Hello(Model model) {
				
		return "hi";
	}
	
	
	@RequestMapping(value = {"/login"},method = RequestMethod.GET)
	public String loginN() {
		
	 
		return "login";
	}
	
	@RequestMapping(value = {"/login"},method = RequestMethod.POST)
	public String login(HttpServletRequest rq , HttpServletResponse rp) {
		String name = rq.getParameter("name");
		String pass = rq.getParameter("pass");
		if(name.equals("name") && pass.equals("pass")) {
			return "loginSuceed";
		}
	 
		return "redirect:login";
	}
	}