package org.example.pazetest.controller;

import org.example.pazetest.dto.PaymentRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping
    public String getPaymentPage(Model model) {
        model.addAttribute("payment", new PaymentRequest());
        return "payment";
    }

    @GetMapping("/error")
    public String getErrorPage() {
        return "error";
    }
}
