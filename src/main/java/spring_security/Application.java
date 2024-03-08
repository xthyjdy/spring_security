package spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static spring_security.Helper.l;

//logout
//https://www.youtube.com/watch?v=0GGFZdYe-FY&list=PPSV 29.03
//base implementation
//https://www.youtube.com/watch?v=BVdQ3iuovg0&list=PPSV  2.01
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		l("done______________________________________________");
	}
}
