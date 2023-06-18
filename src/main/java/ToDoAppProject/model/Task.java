package ToDoAppProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String task_Name;
	private String description;
	private String date;
	private String start_Time;
	private String end_Time;
	private String status;
	private String remarks;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int id, String task_Name, String description, String date, String start_Time, String end_Time,
			String status, String remarks) {
		super();
		this.id = id;
		this.task_Name = task_Name;
		this.description = description;
		this.date = date;
		this.start_Time = start_Time;
		this.end_Time = end_Time;
		this.status = status;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask_Name() {
		return task_Name;
	}
	public void setTask_Name(String task_Name) {
		this.task_Name = task_Name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStart_Time() {
		return start_Time;
	}
	public void setStart_Time(String start_Time) {
		this.start_Time = start_Time;
	}
	public String getEnd_Time() {
		return end_Time;
	}
	public void setEnd_Time(String end_Time) {
		this.end_Time = end_Time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", task_Name=" + task_Name + ", description=" + description + ", date=" + date
				+ ", start_Time=" + start_Time + ", end_Time=" + end_Time + ", status=" + status + ", remarks="
				+ remarks + "]";
	}
	

}
