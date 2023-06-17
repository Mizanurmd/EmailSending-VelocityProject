package ToDoAppProject.confiuration;

import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfiguration {
	@Bean
	public JavaMailSender mailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(465);
		mailSender.setUsername("sizansarder11@gmail.com");
		mailSender.setPassword("wmbirznrcojcziut");
		
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.ssl.enable", true);
		javaMailProperties.put("mail.smtp.starttls.enable", true);
		
		mailSender.setJavaMailProperties(javaMailProperties);
		
		return mailSender;
		
	}
	
	//////////// Velocity Configuration here////////////
	@Bean
	public VelocityEngine velocityEngine() {
		VelocityEngine v = new VelocityEngine();
		v.setProperty("resource.loader", "class");
		v.setProperty("class.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		return v;
	}

}
