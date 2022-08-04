package com.colmeia.email_handler;

public class App {
    public static void main(String[] args) {  
        
        MailBoxHandler mailBoxHandler = new MailBoxHandler();

        mailBoxHandler.filterEmail(new Email("johndoe@email.com", "ti@dh.com", "OS updates"));
        mailBoxHandler.filterEmail(new Email("johndoe@email.com", "ti@colmeia.com", "OS updates"));
        mailBoxHandler.filterEmail(new Email("johndoe@email.com", "gerencia@colmeia.com", "Quarterly budget"));
        mailBoxHandler.filterEmail(new Email("janedoe@email.com", "comercial@dh.com", "comercial"));        

    }

}