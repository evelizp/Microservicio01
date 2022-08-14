package com.microservices.accounts.credit.repository;

import com.microservices.accounts.credit.model.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository extends ReactiveMongoRepository<Credit, Integer> {
    Flux<Credit> findByCustomerId(Integer id);
    Mono<Credit> findByCreditId(Integer id);
}
