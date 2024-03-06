package spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static spring_security.Helper.l;

//https://www.youtube.com/watch?v=BVdQ3iuovg0&list=PPSV  2.01
@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		l("done______________________________________________");
	}
}
