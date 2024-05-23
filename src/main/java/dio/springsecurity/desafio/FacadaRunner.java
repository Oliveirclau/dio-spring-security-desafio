package dio.springsecurity.desafio;

import dio.springsecurity.desafio.facade.OrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FacadaRunner implements CommandLineRunner {
    @Autowired
    private OrderFacade orderFacade;

    @Override
    public void run(String... args) throws Exception {
        orderFacade.completeOrder();
    }
}
