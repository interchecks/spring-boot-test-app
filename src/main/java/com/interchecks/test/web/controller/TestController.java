package com.interchecks.test.web.controller;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(TestController.class);

    @PostMapping("/test")
    public ResponseEntity<String> post(@RequestBody String body) {
        log.info("invoking post(): {}", body);
        return ResponseEntity.ok("SUCCESS");
    }


    @GetMapping("/test")
    public ResponseEntity<String> get() {
        log.info("invoking get()");
        return ResponseEntity.ok("SUCCESS");
    }

}
