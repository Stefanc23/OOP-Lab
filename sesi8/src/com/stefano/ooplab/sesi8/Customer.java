package com.stefano.ooplab.sesi8;

import java.util.LinkedHashMap;

public class Customer extends User {
    private String customer_name, address, email;
    private LinkedHashMap<String, String> credit_card_info;
    private LinkedHashMap<String, Integer> shipping_info;

    Customer(int user_id, String password, String customer_name, String address, String email, String cardNumber, String cardExpDate, String cardCVV) {
        super(user_id, password);
        register(customer_name, address, email, cardNumber, cardExpDate, cardCVV);
    }

    public String customer_name() {
        return customer_name;
    }

    public String address() {
        return address;
    }

    public String email() {
        return email;
    }

    public String bill(int subtotal, int tax) {
        shipping_info = new LinkedHashMap<>();
        shipping_info.put("subtotal", subtotal);
        shipping_info.put("tax", tax);
        shipping_info.put("total", calculate_next_bill_amount(subtotal, tax));

        return (
            "Credit card info:\n\tCredit card number: " + credit_card_info.get("cardNumber") +
            "\n\tCard Expiration Date: " + credit_card_info.get("cardExpDate") +
            "\n\tCVV: " + credit_card_info.get("cardCVV") +
            "\nShipping info:\n\tSubtotal: " + shipping_info.get("subtotal") +
            "\n\tTax: " + shipping_info.get("tax") +
            "\n\tTotal: " + shipping_info.get("total")
        );
    }

    public void register(String customer_name, String address, String email, String cardNumber, String cardExpDate, String cardCVV) {
        update_profile(customer_name, address, email);
        credit_card_info = new LinkedHashMap<>();
        credit_card_info.put("cardNumber", cardNumber);
        credit_card_info.put("cardExpDate", cardExpDate);
        credit_card_info.put("cardCVV", cardCVV);
    }

    public boolean login(String email, String password) {
        if(this.email.equals(email)) return super.verify_login(password);
        return false;
    }

    public void update_profile(String customer_name, String address, String email) {
        this.customer_name = customer_name;
        this.address = address;
        this.email = email;
    }

    private int calculate_next_bill_amount(int subtotal, int tax) {
        return subtotal + (subtotal * tax / 100);
    }

    private void generate_invoice_pdf_version() {
        //error 404: pdf generator library not found
    }
}
