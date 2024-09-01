package FerrebocApp.FerrebocApp;
//
//import FerrebocApp.FerrebocApp.Entity.Product;
//import FerrebocApp.FerrebocApp.Service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class FerrebocAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FerrebocAppApplication.class, args);

	}

}
