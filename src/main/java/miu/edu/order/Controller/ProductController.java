package miu.edu.order.Controller;
import lombok.extern.slf4j.Slf4j;
import miu.edu.order.Domain.Product;
import miu.edu.order.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock/products")
@Slf4j
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public List<Product> getAllUsers(){
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    public void createProduct(@RequestBody Product product){
        log.info("Inside createUser of UserController");
        productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductByProductId(@PathVariable("id") Long productId){
        log.info("Inside findUser of UserController");
        return productService.findProductByProductId(productId);
    }
}
