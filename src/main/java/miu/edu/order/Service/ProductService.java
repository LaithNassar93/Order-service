package miu.edu.order.Service;

import lombok.extern.slf4j.Slf4j;
import miu.edu.order.Domain.Product;
import miu.edu.order.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product) {
//        log.info("I am Inside saveUser of UserService");
        productRepository.save(product);
    }

    public Product findProductByProductId(Long productId) {
//        log.info("I am Inside findUser of UserService");
        return productRepository.findProductsByProductId(productId);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();

    }


}
