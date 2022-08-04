package com.colmeia.email_handler;

public class CommercialEmailHandler extends EmailHandler {

    @Override
    public void filterEmail(Email email) {
        if (email.getTo().equalsIgnoreCase("comercial@colmeia.com") || email.getSubject().equalsIgnoreCase("comercial")) {
            System.out.println("Encaminhando para o comercial");
        } else {
            if (next != null) {
                next.filterEmail(email);
            }
        }
    }
    
}
