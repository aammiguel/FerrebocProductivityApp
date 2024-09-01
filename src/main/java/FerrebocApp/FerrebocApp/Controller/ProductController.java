package FerrebocApp.FerrebocApp.Controller;

//import FerrebocApp.FerrebocApp.Service.ProductService;
import FerrebocApp.FerrebocApp.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController
{
    private List<Product> productsList = List.of(new Product("pinza", "ab", 123, "nuevo"));
    @GetMapping("/hello")
    public String hello(){
        return "hello ";
    }

    @GetMapping("/products")
    public List<Product> get(){
        return productsList;
    }
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("/products")
//    public String listProducts(Model model){
//        model.addAttribute("products", productService.findAllProducts());
//        return "products";
//
//    }
//
}
