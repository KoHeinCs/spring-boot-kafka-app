package com.ashwetaw.kafka.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PaymentDTO {
    private String transactionId;
    private LocalDateTime transactionTimestamp;
    private Double transactionAmount;
    private Integer cardNumber;
    private Double cardBalance;

    public PaymentDTO(){}

    public PaymentDTO(String transactionId,LocalDateTime transactionTimestamp,Double transactionAmount,Integer cardNumber,Double cardBalance){
        this.transactionId = transactionId;
        this.transactionTimestamp = transactionTimestamp;
        this.transactionAmount = transactionAmount;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }
}
