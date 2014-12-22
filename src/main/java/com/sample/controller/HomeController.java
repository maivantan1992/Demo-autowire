package com.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.entity.Section;
import com.sample.entity.User;
import com.sample.manager.ISectionManager;
import com.sample.manager.IUserManager;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	
	@Autowired
	IUserManager userManager;
	
	@Autowired
	ISectionManager sectionManager;
	
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		//User user = userManager.getById(1);
		//System.out.println("User email: "+ user.getEmployeeEmail());
		Section section = sectionManager.getById(228);
		System.out.println("Section : "+ section.getSection());
		
		//Section section2 = new Section(section.getBu(), "TEST", section.getDepartments());
		//Integer sectionId = sectionManager.insert(section2);
		
		//Commmit
		return "home";
	}

}
