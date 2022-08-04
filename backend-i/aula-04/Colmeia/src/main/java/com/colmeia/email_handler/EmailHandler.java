package com.colmeia.email_handler;

public abstract class EmailHandler {

    protected EmailHandler next;

    public EmailHandler getNext() {
        return next;
    }

    public void setNext(EmailHandler next) {
        this.next = next;
    }

    public abstract void filterEmail(Email email);

}
