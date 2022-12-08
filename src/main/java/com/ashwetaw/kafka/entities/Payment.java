package com.ashwetaw.kafka.entities;

import com.ashwetaw.kafka.config.Audit;
import com.ashwetaw.kafka.config.AuditListener;
import com.ashwetaw.kafka.config.IAudit;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@ToString
@EntityListeners(AuditListener.class)
public class Payment implements IAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String transactionId;
    private LocalDateTime transactionTimestamp;
    private Double transactionAmount;
    private Integer cardNumber;
    private Double cardBalance;

    /** for audit log **/
    @Embedded
    Audit audit;

    /** for transaction concurrency control **/
    @Version
    private int version;

}
