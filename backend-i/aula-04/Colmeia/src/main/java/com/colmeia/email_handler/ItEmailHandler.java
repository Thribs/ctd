package com.colmeia.email_handler;

public class ItEmailHandler extends EmailHandler {

    @Override
    public void filterEmail(Email email) {
        if (email.getTo().equalsIgnoreCase("ti@colmeia.com") || email.getSubject().equalsIgnoreCase("ti")) {
            System.out.println("Enviando para o departamento de TI");
        } else {
            if (next != null) {
                next.filterEmail(email);
            }
        }
    }
    
}
