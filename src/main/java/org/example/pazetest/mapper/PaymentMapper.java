package org.example.pazetest.mapper;

import org.example.pazetest.dto.PaymentRequest;
import org.example.pazetest.service.PaymentType;
import org.example.pazetest.dto.PazeCreatePaymentRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {
    @Value("${payment.currency}")
    private String currency;
    public PazeCreatePaymentRequest map(PaymentRequest request, PaymentType paymentType) {
        var pazeCreatePaymentRequest = new PazeCreatePaymentRequest();
        pazeCreatePaymentRequest.setPaymentType(paymentType.getType());
        pazeCreatePaymentRequest.setAmount(request.getAmount());
        pazeCreatePaymentRequest.setCurrency(currency);

        return pazeCreatePaymentRequest;
    }
}
