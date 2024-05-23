package dio.springsecurity.desafio.facade;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment() {
        System.out.println("Pagamento processado.");
    }
}
