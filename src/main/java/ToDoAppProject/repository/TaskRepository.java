package ToDoAppProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ToDoAppProject.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
