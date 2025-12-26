package com.backend.yumonney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HealthCheckController {

    @PostMapping("/")
    public ResponseEntity<Quote> check() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/health-check")
    public ResponseEntity<List<Quote>> healthCheck() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
