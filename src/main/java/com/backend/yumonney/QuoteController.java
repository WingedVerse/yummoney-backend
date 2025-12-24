package com.backend.yumonney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/yumonney")
public class QuoteController {

    @Autowired
    private QuoteService service;

    @PostMapping("/create-quote")
    public ResponseEntity<Quote> create(@RequestBody Quote quote) {
        return new ResponseEntity<>(service.create(quote), HttpStatus.CREATED);
    }

    @GetMapping("/all-quotes")
    public ResponseEntity<List<Quote>> getAll() {
        return new ResponseEntity<>(service.getAllQuotes(), HttpStatus.OK);
    }
}
