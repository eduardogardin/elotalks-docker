package com.gardin.elotalks.dockertalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockertalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockertalkApplication.class, args);
    }



}
