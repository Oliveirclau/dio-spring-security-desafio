package dio.springsecurity.desafio.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {
    @Autowired
    private OrderService orderService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private ShippingService shippingService;

    public void completeOrder() {
        orderService.placeOrder();
        paymentService.processPayment();
        shippingService.shipOrder();
    }
}
