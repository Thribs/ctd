package com.colmeia.email_handler;

public class MailBoxHandler {

    EmailHandler commercialHandler = new CommercialEmailHandler();
    EmailHandler managementHandler = new ManagementEmailHandler();
    EmailHandler itHandler = new ItEmailHandler();
    EmailHandler spamHandler = new SpamEmailHandler();

    public MailBoxHandler() {

        commercialHandler.setNext(managementHandler);
        managementHandler.setNext(itHandler);
        itHandler.setNext(spamHandler);
    }

    public void filterEmail(Email email) {
        commercialHandler.filterEmail(email);
    }
}
