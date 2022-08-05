package me.thribs.thribs_flix;

public class IpAddress {
    
    private final String firstOctet;
    private final String secondOctet;
    private final String thirdOctet;
    private final String fourthOctet;

    public IpAddress(String firstOctet, String secondOctet, String thirdOctet, String fourthOctet) {
        this.firstOctet = firstOctet;
        this.secondOctet = secondOctet;
        this.thirdOctet = thirdOctet;
        this.fourthOctet = fourthOctet;
    }

    public String getIP() {
        return firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet;
    }

    public Country getCountryOfOrigin() {
        int firstOctetInt = Integer.parseInt(firstOctet);
        boolean isArgentina = firstOctetInt >= 0 && firstOctetInt <= 49;
        boolean isBrazil = firstOctetInt >= 50 && firstOctetInt <= 99;
        boolean isColombia = firstOctetInt >= 100 && firstOctetInt <= 149;
        
        if(isArgentina) {
            return Country.ARGENTINA;
        }
        else if(isBrazil) {
            return Country.BRAZIL;
        }
        else if(isColombia) {
            return Country.COLOMBIA;
        }
        else {
            throw new MovieNotAvailableException("Filme não disponível para o país");
        }
    }
}
