import java.util.Objects;

class Client {
    private String name;
    private String cpf;
    private String phoneNumber;
    private String emailAddress;

    public Client(String name, String cpf, String phoneNumber, String emailAddress) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void purchase() {
        System.out.println("Client " + this.name + " purchased a photo");
    }
        
}