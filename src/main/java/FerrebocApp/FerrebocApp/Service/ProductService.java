//package FerrebocApp.FerrebocApp.Service;
//
//import FerrebocApp.FerrebocApp.Entity.Product;
//import FerrebocApp.FerrebocApp.Repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService
//{
//    @Autowired
//    private ProductRepository productRepository;
//
//    public List<Product> findAllProducts(){
//        return productRepository.findAll();
//    }
//
//    public Product findProductById(Long id){
//        Product product;
//        product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
//        return product;
//    }
//
//    public void createProduct(Product product){
//        productRepository.save(product);
//    }
//
//    public void updateProduct(Product product){
//        productRepository.save(product);
//    }
//    public void deleteProduct(Long id){
//        Product product;
//        product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product no encontrado"));
//        productRepository.deleteById(product.getId());
//    }
//
//}
