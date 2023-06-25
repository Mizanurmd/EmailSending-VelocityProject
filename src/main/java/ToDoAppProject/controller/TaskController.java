package ToDoAppProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ToDoAppProject.model.Status;
import ToDoAppProject.model.Task;
import ToDoAppProject.service.StatusService;
import ToDoAppProject.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskSer;
	@Autowired
	private StatusService stServ;
	
	@GetMapping("/home")
	public String getTask(Model m) {
		m.addAttribute("taskList", taskSer.getAllTask());
		System.out.println(taskSer.getAllTask());
		
		return "views/home.html";
	}
	
	@GetMapping("/addForm")
	public String addTask(Model m) {
		Task task= new Task();
		m.addAttribute("task",task);
		
	List<Status> listStatus = stServ.getAllStatus();
	m.addAttribute("listStatus",listStatus);

		return "views/addForm.html";
		
	}
	@PostMapping("/save")
	public String saveTask(@ModelAttribute("task")Task task, Model m) {
		taskSer.saveTask(task);
		return"redirect:/home";
	}
	
	@GetMapping("/update/{id}")
	public String updateTask(@PathVariable("id")Integer id, Model m) {
		Task task = taskSer.getByTaskId(id);
		m.addAttribute("task",task);
		
		List<Status> listStatus = stServ.getAllStatus();
		m.addAttribute("listStatus",listStatus);
		
		
		return "views/updateFrom.html";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTask(@PathVariable("id")Integer id) {
		taskSer.deleteTask(id);
		return "redirect:/home";
	}
	
	
}
