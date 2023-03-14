package org.example.pazetest.controller;

import lombok.RequiredArgsConstructor;
import org.example.pazetest.dto.PaymentRequest;
import org.example.pazetest.service.PazeService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PazeService pazeService;

    @PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public RedirectView createPayment(PaymentRequest request) throws IOException {
        return new RedirectView(pazeService.createDeposit(request));
    }

}
