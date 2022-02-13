package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Start {
 public static void main(String[] args) {
	 System.out.println("Start server...");
		SpringApplication.run(Start.class, args);
}
}

