package com.microservices.accounts.credit.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@Document(collection ="credits")
public class Credit {

    @Id
    private String creditId;

    private String customerId;

    private String customerType;

    private String creditDate;

    private Double creditAmount;

    private Integer creditTermInMonths;

    private Double annualInterestRate;

}
