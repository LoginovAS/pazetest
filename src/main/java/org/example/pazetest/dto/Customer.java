package org.example.pazetest.dto;

import lombok.Data;

@Data
public class Customer {
    private String referenceId;
    private String citizenshipCountryCode;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String phone;
    private String locale;
    private String accountNumber;
    private String accountName;
    private String bank;
    private String bankBranch;
    private String routingGroup;
    private boolean kycStatus;
    private boolean paymentInstrumentKycStatus;
    private String dateOfFirstDeposit;
    private int depositsAmount;
    private int withdrawalsAmount;
    private int depositsCnt;
    private int withdrawalsCnt;
}
