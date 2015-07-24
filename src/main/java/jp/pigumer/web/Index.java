package jp.pigumer.web;

import jp.pigumer.mqtt.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@Controller
@EnableAutoConfiguration
@Configuration
public class Index {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @Bean
    public Client getClient() {
        return new Client();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Index.class, args);
    }
}
