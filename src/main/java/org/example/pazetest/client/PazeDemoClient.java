package org.example.pazetest.client;

import org.example.pazetest.dto.PazeCreatePaymentRequest;
import org.example.pazetest.dto.PazeCreatePaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * Client sends requests to the payment system.
 */
@FeignClient(name = "pazeDemoClient", url = "${paze.server}", path = "${paze.server.path}")
public interface PazeDemoClient {
    @PostMapping("/payments")
    PazeCreatePaymentResponse createPayment(@RequestHeader("Authorization") String authorization, @RequestBody PazeCreatePaymentRequest request);
}

