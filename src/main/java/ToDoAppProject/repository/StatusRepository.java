package ToDoAppProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ToDoAppProject.model.Status;

public interface StatusRepository extends JpaRepository<Status, Integer>{

}
