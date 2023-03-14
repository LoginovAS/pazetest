package org.example.pazetest.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentType {
    DEPOSIT("DEPOSIT");

    private final String type;
}
