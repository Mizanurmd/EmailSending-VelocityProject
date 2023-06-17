package ToDoAppProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import ToDoAppProject.dto.EmailSender;
import ToDoAppProject.model.Task;
import ToDoAppProject.service.TaskService;



@Controller
public class EmailController {

	@Autowired
	private TaskService taskServ;
	@Autowired
	private EmailSender emailSender;
	
	@GetMapping("/sendMail")
	public String sendEmail(Model m, @ModelAttribute("task") Task task) {
//		taskServ.saveTask(task);
		
		String emailCon = emailSender.sendEmailVelocityTemplate(task);
		m.addAttribute("response", emailCon);
		 
		return "views/success.html";
		
	}

}
