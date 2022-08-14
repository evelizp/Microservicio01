package com.microservices.accounts.credit.service;

import com.microservices.accounts.credit.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Flux<Credit> findAll();
    Mono<Credit> create(Credit credit);
    Flux<Credit> findByCustomerId(Integer customerId);
    Mono<Credit> findByCreditId(Integer creditId);
    Mono<Credit> update(Credit credit);
    Mono deleteById(Integer creditId);
}
