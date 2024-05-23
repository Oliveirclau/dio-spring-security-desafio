package dio.springsecurity.desafio.singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonService {
    private SingletonService() {
    }

    public void execute() {
        System.out.println("Executando Singleton Service");
    }
}
