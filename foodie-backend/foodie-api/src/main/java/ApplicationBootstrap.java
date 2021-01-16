import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "org.example.mapper")
@ComponentScan(basePackages = { "org.example"})
public class ApplicationBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootstrap.class,args);
    }
}
