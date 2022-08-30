package me.thribs.quadvago.model;

public class Branch {
    
    private Integer id;
    private final String name;
    private final String addressStreet;
    private final String addressNumber;
    private final String addressCity;
    private final String addressState;
    private final boolean isFiveStars;

    public Branch(String name, String addressStreet, String addressNumber, String addressCity, String addressState, boolean isFiveStars) {
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressNumber = addressNumber;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.isFiveStars = isFiveStars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public boolean isFiveStars() {
        return isFiveStars;
    }

    @Override
    public String toString() {
        return "Branch [addressCity=" + addressCity + ", addressNumber=" + addressNumber + ", addressStreet="
                + addressStreet + ", id=" + id + ", isFiveStars=" + isFiveStars + ", name=" + name + "]";
    }

        

}
