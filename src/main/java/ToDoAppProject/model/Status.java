package ToDoAppProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="status")
public class Status {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String type;

}
