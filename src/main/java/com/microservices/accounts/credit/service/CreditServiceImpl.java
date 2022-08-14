package com.microservices.accounts.credit.service;

import com.microservices.accounts.credit.model.Credit;
import com.microservices.accounts.credit.repository.CreditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CreditServiceImpl implements CreditService{

    @Autowired
    private CreditRepository creditRepository;


    @Override
    public Flux<Credit> findAll() {
        return creditRepository.findAll();
    }

    @Override
    public Mono<Credit> create(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public Flux<Credit> findByCustomerId(Integer customerId) {
        return creditRepository.findByCustomerId(customerId);
    }

    @Override
    public Mono<Credit> findByCreditId(Integer creditId) {
        return creditRepository.findByCreditId(creditId);
    }

    @Override
    public Mono<Credit> update(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public Mono deleteById(Integer creditId) {
        return creditRepository.deleteById(creditId);
    }
}
