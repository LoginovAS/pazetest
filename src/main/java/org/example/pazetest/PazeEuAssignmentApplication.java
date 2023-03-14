package org.example.pazetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableConfigurationProperties
@SpringBootApplication
public class PazeEuAssignmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PazeEuAssignmentApplication.class, args);
    }
}
