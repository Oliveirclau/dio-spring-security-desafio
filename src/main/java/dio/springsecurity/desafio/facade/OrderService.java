package dio.springsecurity.desafio.facade;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void placeOrder() {
        System.out.println("Pedido realizado.");
    }
}
