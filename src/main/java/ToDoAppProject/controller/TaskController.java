package ToDoAppProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import ToDoAppProject.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskSer;
	
	@GetMapping("/home")
	public String getTask(Model m) {
		
		m.addAttribute("taskList", taskSer.getAllTask());
		System.out.println(taskSer.getAllTask());
		
		return "views/home.html";
	}
	

}
