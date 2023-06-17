package ToDoAppProject.service;

import java.util.List;

import ToDoAppProject.model.Task;

public interface TaskService {
	List<Task>getAllTask();
	void saveTask(Task task);
	Task getByTaskId(Integer id);
	void deleteTask(Integer id);
	
}
