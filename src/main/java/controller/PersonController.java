package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Person;

@Controller
public class PersonController {
	
	@RequestMapping(value="/get",method = RequestMethod.GET)
	public String person(
			HttpServletRequest rq
			) {
		Person p = new Person();
		p.setId(1);
		p.setName("hsff");
		rq.setAttribute("person", p);
		
		return "person";
	}
	
}
