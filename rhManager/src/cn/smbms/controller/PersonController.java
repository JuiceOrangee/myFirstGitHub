package cn.smbms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.smbms.pojo.Person;
import cn.smbms.service.PersonService;

@Controller
public class PersonController {
	@Resource
	PersonService personService;
	
	@RequestMapping("/hrAction.do")
	public String getPersonList(Model model) {
		List<Person> personList = new ArrayList<Person>();
		personList = personService.getPersonList();
		System.out.println(personList.toString());
		model.addAttribute(personList);
		return "index";
	}

}
