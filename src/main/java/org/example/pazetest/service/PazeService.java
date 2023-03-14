package org.example.pazetest.service;

import lombok.RequiredArgsConstructor;
import org.example.pazetest.client.PazeDemoClient;
import org.example.pazetest.dto.PaymentRequest;
import org.example.pazetest.mapper.PaymentMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class PazeService {

    private final PazeDemoClient client;
    private final AuthService authService;
    private final PaymentMapper paymentMapper;

    public String createDeposit(PaymentRequest request) throws IOException {
        var response = client.createPayment("Bearer " + authService.receiveToken(), paymentMapper.map(request, PaymentType.DEPOSIT));

        if (response.getStatus() == HttpStatus.OK.value()) {
            return response.getResult().getRedirectUrl();
        }

        return "error";
    }

}
