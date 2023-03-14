package org.example.pazetest.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private static final String token = "cAmmvalAikARkB81fgxgMtnMbEdNbuWa";
    /**
     * Returns authorization token.
     * In common case will receive it from some authorization system.
     */
    public String receiveToken() {
        return token;
    }
}
