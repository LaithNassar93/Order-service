package miu.edu.order.Service;

import miu.edu.order.Domain.Product;
import miu.edu.order.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class StockManager {
    @Autowired
    ProductRepository productRepository;

    public boolean checkout(Long productId, Integer neededAmount) {
        Optional<Product> product = Optional.ofNullable(productRepository.findProductsByProductId(productId));
        int inStore = product.get().getProductAmount();
        int updatedCount = inStore - neededAmount;
        product.get().setProductAmount(updatedCount);

        productRepository.findById(productId).map(target -> {
            target.setProductAmount(updatedCount);
            return productRepository.save(target);
        });

        return true;
    }

    public boolean manageStock(Long productId, Integer amount) {
        if (productRepository.existsById(productId)) {
            if (productRepository.getById(productId).getProductAmount() < amount) {
                return false;
            } else {
                return checkout(productId, amount);
            }
        } else {
            return false;
        }
    }

}
