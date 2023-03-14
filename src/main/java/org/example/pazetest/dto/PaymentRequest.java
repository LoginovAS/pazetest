package org.example.pazetest.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Input payment request body
 */
@Data
public class PaymentRequest {
    private BigDecimal amount;
}
