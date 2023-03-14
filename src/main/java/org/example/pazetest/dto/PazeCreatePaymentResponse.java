package org.example.pazetest.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * Payment service response
 */
@Data
public class PazeCreatePaymentResponse {
    private Date timestamp;
    private int status;
    private Result result;
    private String error;
    private String message;
    private ArrayList<Error> errors;

    @Data
    public static class Result {
        private String id;
        private String paymentType;
        private String state;
        private BigDecimal amount;
        private String currency;
        private String redirectUrl;
    }

    @Data
    public class Error{
        private ArrayList<String> codes;
        private ArrayList<Argument> arguments;
        private String defaultMessage;
        private String objectName;
        private String field;
        private boolean bindingFailure;
    }

    @Data
    public static class Argument {
        private ArrayList<String> codes;
        private String defaultMessage;
    }
}
