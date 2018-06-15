package nyeck.nelly.wis.hw2.Assignment2;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Assignment2Application {

	public static HashMap<Long, Student> hmStudent;
	
	public static void main(String[] args) {
		hmStudent = new HashMap<Long, Student>();
		
		Student one = new Student("Nelly Nyeck", "WIS");
		hmStudent.put(new Long(one.getId()), one);
		
		SpringApplication.run(Assignment2Application.class, args);
		
		Student two = new Student("Seydou Njoya", "WIS");
		hmStudent.put(new Long(two.getId()), two);
		
	}
}