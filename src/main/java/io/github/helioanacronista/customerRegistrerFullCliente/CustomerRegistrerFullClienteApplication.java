package io.github.helioanacronista.customerRegistrerFullCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class CustomerRegistrerFullClienteApplication {



	public static void main(String[] args) {
		SpringApplication.run(CustomerRegistrerFullClienteApplication.class, args);
	}

}
