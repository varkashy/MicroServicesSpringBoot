package config.server.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBootApplication.class,args);
    }
}
