package coffee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import coffee.beans.Menu;
import coffee.config.MenuBeanConfig;
import coffee.repo.IMenuRepo;

@SpringBootApplication
public class CoffeeMenuApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeMenuApplication.class, args);
	}
	
	@Autowired
	IMenuRepo repo;
	
	

}
