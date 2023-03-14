package org.example.pazetest.dto;

import lombok.Data;

@Data
public class BillingAddress {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String countryCode;
    private String postalCode;
    private String state;
}
