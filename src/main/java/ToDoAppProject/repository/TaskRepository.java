package ToDoAppProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import ToDoAppProject.model.Task;


public interface TaskRepository extends JpaRepository<Task, Integer> {



}
