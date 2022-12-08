package com.ashwetaw.kafka.mapper;

import com.ashwetaw.kafka.dto.PaymentDTO;
import com.ashwetaw.kafka.entities.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper extends BaseMapper<PaymentDTO, Payment>{
}
