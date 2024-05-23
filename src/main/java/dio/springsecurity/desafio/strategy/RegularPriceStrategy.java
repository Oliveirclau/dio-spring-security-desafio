package dio.springsecurity.desafio.strategy;

import org.springframework.stereotype.Component;

@Component
public class RegularPriceStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price;
    }

    @Override
    public double claculatePrice(double price) {
        return 0;
    }
}
