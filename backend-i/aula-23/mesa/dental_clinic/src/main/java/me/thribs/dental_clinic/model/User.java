package me.thribs.dental_clinic.model;

public class User {
    
    private int id;
    private final String name;
    private final String email;
    private final String password;
    private final AccessLevel accessLevel;

    public User(String name, String email, String password, AccessLevel accessLevel) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    @Override
    public String toString() {
        return "User [accessLevel: " + accessLevel + ", email: " + email + ", id: " + id + ", name: " + name +  "]";
    }
    
}
