package com.ashwetaw.kafka.config;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.Instant;


@Embeddable
@Getter
@Setter
public class Audit {

    @Column(name = "createdBy", updatable = false)
    private String createdBy;
    @Column(name = "createdDate", updatable = false)
    private Instant createdDate;
    @Column(name = "updatedBy")
    private String updatedBy;
    @Column(name = "updatedDate")
    private Instant updatedDate;

}
