package com.microservices.accounts.credit.controller;

import com.microservices.accounts.credit.model.Credit;
import com.microservices.accounts.credit.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/credits")
public class CreditController {

    @Autowired
    private CreditService service;

    @GetMapping
    public Flux<Credit> getAllCredits(){
        return service.findAll();
    }

    @GetMapping("/find/{customerId}")
    public Flux<Credit> findByCustomerId(@PathVariable("customerId") Integer customerId){
        return service.findByCustomerId(customerId);
    }

    @GetMapping("/find/{creditId}")
    public Mono<Credit> findByCreditId(@PathVariable("creditId") Integer creditId){
        return service.findByCreditId(creditId);
    }

    @PostMapping
    public Mono<Credit> create(@RequestBody Credit credit){
        return service.create(credit);
    }

    @PostMapping("/update")
    public Mono<Credit> update(@RequestBody Credit credit) {
        return service.update(credit);
    }

    @DeleteMapping("/byId/{creditId}")
    public Mono<Credit> delete(@RequestBody Integer creditId){
        return service.deleteById(creditId);
    }

}
