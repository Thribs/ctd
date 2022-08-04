package com.colmeia.email_handler;

public class SpamEmailHandler extends EmailHandler {

    @Override
    public void filterEmail(Email email) {
        System.out.println("Email marcado como spam");
    }
    
}
