package com.backend.yumonney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class HealthCheckController {

    @GetMapping("/api")
    public ResponseEntity<?> check() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/health-check")
    public ResponseEntity<?> healthCheck() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


