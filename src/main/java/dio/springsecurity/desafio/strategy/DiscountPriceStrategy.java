package dio.springsecurity.desafio.strategy;

import org.springframework.stereotype.Component;

@Component
public class DiscountPriceStrategy implements PricingStrategy {


    @Override
    public double calculatePrice(double price) {
        return price * 0.9;
    }

    @Override
    public double claculatePrice(double price) {
        return 0;
    }


}
