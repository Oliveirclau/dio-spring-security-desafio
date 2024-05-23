package dio.springsecurity.desafio.facade;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public void shipOrder() {
        System.out.println("Pedido enviado.");
    }
}
