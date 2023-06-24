package ToDoAppProject.controller;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ToDoAppProject.dto.EmailSender;
import ToDoAppProject.model.Task;
import ToDoAppProject.service.TaskService;



@Controller
public class EmailController {
	@Autowired
	private VelocityEngine ve;
	@Autowired
	private TaskService taskServ;
	@Autowired
	private EmailSender emailSender;
	
	@GetMapping("/sendMail")
	public String sendEmail(Model m,Task task) {
		String emailCon = emailSender.sendEmailVelocityTemplate(task);
		m.addAttribute("response", emailCon);
		 
		return "views/success.html";
		
	}
	
	@GetMapping("/test")
	
	public String testvelocity() {

		return "vtemplates/test.vm";
		
		
	}

}
