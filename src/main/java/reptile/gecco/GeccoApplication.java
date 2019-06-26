package reptile.gecco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reptile.gecco.unit.NovelEngine;

@SpringBootApplication
public class GeccoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeccoApplication.class, args);
        NovelEngine.NovelNameEngine();
    }

}
