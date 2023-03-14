package org.example.pazetest.dto;

import lombok.Data;

@Data
public class Card {
    private String cardNumber;
    private String cardholderName;
    private String cardSecurityCode;
    private String expiryMonth;
    private String expiryYear;
}
