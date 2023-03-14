package org.example.pazetest.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Request body for payment service
 */
@Data
public class PazeCreatePaymentRequest {
    private String referenceId;
    private String paymentType;
    private String paymentMethod;
    private BigDecimal amount;
    private String currency;
    private String parentPaymentId;
    private String description;
    private Card card;
    private Customer customer;
    private BillingAddress billingAddress;
    private String returnUrl;
    private String webhookUrl;
    private boolean startRecurring;
    private String recurringToken;
    private AdditionalParameters additionalParameters;

    @Data
    public static class AdditionalParameters{
        private String bankCode;
        private String countryOfBirth;
    }
}
