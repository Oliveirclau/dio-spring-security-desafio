package dio.springsecurity.desafio;

import dio.springsecurity.desafio.singleton.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DioSpringSecurityDesafioApplication implements CommandLineRunner {
	@Autowired
	private SingletonService singletonService;

	public static void main(String[] args) {
		SpringApplication.run(DioSpringSecurityDesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		singletonService.execute();
	}


}
