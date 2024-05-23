package dio.springsecurity.desafio.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateProductPrice(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow();
        return pricingStrategy.calculatePrice(product.getPrice());
    }
}
