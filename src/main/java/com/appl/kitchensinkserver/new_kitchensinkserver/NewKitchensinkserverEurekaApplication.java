package com.appl.kitchensinkserver.new_kitchensinkserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NewKitchensinkserverEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewKitchensinkserverEurekaApplication.class, args);
    }

}
