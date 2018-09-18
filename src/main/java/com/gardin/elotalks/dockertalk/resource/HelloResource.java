package com.gardin.elotalks.dockertalk.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping
    public ResponseEntity<String> helloElotalks() {

        return ResponseEntity.ok("Hello EloTalks");
    }
}
