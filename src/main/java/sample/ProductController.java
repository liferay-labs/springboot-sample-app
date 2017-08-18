package sample;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class ProductController {

    @RequestMapping("/products")
    public Set<String> getProducts() {

        return ProductRepository.getProductNames();
    }

    @RequestMapping("/products/{productName}")
    public Product getProduct(@PathVariable(value = "productName") String productName) {

        return ProductRepository.getProductByName(productName);
    }

}
