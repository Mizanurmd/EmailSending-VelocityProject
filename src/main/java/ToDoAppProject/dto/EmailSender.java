package ToDoAppProject.dto;

import java.io.StringWriter;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import ToDoAppProject.model.Task;
import jakarta.mail.internet.MimeMessage;

@Component
public class EmailSender {
	@Autowired
	private JavaMailSender jmSender;
	@Autowired
	private VelocityEngine vEngine;
	
	public String sendEmailVelocityTemplate(Task task) {
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper m = new MimeMessageHelper(mimeMessage);
				//m.setTo("mizanur021991@gmail.com");
				m.setTo("mizanur.rahman@metafour.com");
				m.setFrom("sizansarder11@gmail.com");
				m.setSubject("Task Completed");
				
				VelocityContext vCon = new VelocityContext();
				vCon.put("task", task);
				
				StringWriter writer = new StringWriter();
				vEngine.mergeTemplate("templates/vtemplates/email-template.vm", "UTF-8", vCon, writer);

			
				m.setText(writer.toString(), true);
				
			}
		};
		try {
			jmSender.send(preparator);
			double d = 5/0;
			return "Email sending completed.";

		} catch (Exception e) {
			e.printStackTrace();
			return "Email not sent. due to " + e.getMessage();
		}
			
		
	}

}
