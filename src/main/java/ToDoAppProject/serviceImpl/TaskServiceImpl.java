package ToDoAppProject.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToDoAppProject.model.Task;
import ToDoAppProject.repository.TaskRepository;
import ToDoAppProject.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{
	@Autowired
	private TaskRepository taskRepo;
	
	@Override
	public List<Task> getAllTask() {
		
		return taskRepo.findAll();
	}

	@Override
	public void saveTask(Task task) {
		this.taskRepo.save(task);
		
	}

	@Override
	public Task getByTaskId(Integer id) {
		Optional<Task>optional = taskRepo.findById(id);
		Task task = null;
		if(optional.isPresent()) {
			task = optional.get();
		}else {
			throw new RuntimeException("Test todo Id is not found::"+ id);
		}
		return task;
	}

	@Override
	public void deleteTask(Integer id) {
		this.taskRepo.deleteById(id);
		
	}


	

}
