package dio.springsecurity.desafio;

import dio.springsecurity.desafio.strategy.DiscountPriceStrategy;
import dio.springsecurity.desafio.strategy.ProductService;
import dio.springsecurity.desafio.strategy.RegularPriceStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StrategyRunner implements CommandLineRunner {
    @Autowired
    private ProductService productService;

    @Autowired
    private RegularPriceStrategy regularPriceStrategy;

    @Autowired
    private DiscountPriceStrategy discountPriceStrategy;

    @Override
    public void run(String... args) throws Exception {
        productService.setPricingStrategy(regularPriceStrategy);
        System.out.println("Preço regular: " + productService.calculateProductPrice(1L));

        productService.setPricingStrategy(discountPriceStrategy);
        System.out.println("Preço com desconto: " + productService.calculateProductPrice(1L));
    }
}
