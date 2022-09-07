package com.cst.springcloud.dao;

import com.cst.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
