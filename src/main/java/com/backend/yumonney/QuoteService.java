package com.backend.yumonney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository repository;

    public Quote create(Quote quote){
        if (quote.getFullName()!= null && quote.getEmail()!= null && quote.getPhone()!= 0) {
            return repository.save(quote);
        }
        else {
            return null;
        }
    }


    public List<Quote> getAllQuotes(){
        return repository.findAll();
    }
}
