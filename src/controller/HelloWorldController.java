package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorldForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorldProcessedForm";
		
	}
	
	@RequestMapping("/processFormModel")
	public String processFormModel(
			HttpServletRequest request,
			Model model) {
		String name = request.getParameter("studentName");
	 name = name.toUpperCase();
	 String result = "Yo! " + name;
	 model.addAttribute("message", result);
		
		return "helloWorldProcessedForm";
		
	}
	
	
}
