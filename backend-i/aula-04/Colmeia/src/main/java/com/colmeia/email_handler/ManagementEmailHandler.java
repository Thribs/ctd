package com.colmeia.email_handler;

public class ManagementEmailHandler extends EmailHandler {

    @Override
    public void filterEmail(Email email) {
        if (email.getTo().equalsIgnoreCase("gerencia@colmeia.com") || email.getSubject().equalsIgnoreCase("gerência")) {
            System.out.println("Enviando para a gerência");
        } else {
            if (next != null) {
                next.filterEmail(email);
            }
        }
    }
    
}
