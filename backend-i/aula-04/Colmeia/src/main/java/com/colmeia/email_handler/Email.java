package com.colmeia.email_handler;

public class Email {
    
    private final String from;
    private final String to;
    private final String subject;

    public Email(String from, String to, String subject) {
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Email{" + "from=" + from + ", to=" + to + ", subject=" + subject + '}';
    }
}
