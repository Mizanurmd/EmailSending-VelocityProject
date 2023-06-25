package ToDoAppProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToDoAppProject.model.Status;
import ToDoAppProject.repository.StatusRepository;
import ToDoAppProject.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{

	@Autowired
	private StatusRepository stRepo;
	@Override
	public List<Status> getAllStatus() {
		// TODO Auto-generated method stub
		return stRepo.findAll();
	}

}
