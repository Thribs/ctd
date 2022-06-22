package me.thribs.cup;

public class Player implements Comparable<Player> {

    private final String lastName;
    private String jerseyNumber;
    private Position position;
    private Escalation escalation;

    public Player(String lastName) {
        this.lastName = lastName;
    }

    public Player(String lastName, String jerseyNumber, Position position, Escalation escalation) {
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.escalation = escalation;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public Position getPosition() {
        return position;
    }

    public Escalation getEscalation() {
        return escalation;
    }

    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setEscalation(Escalation escalation) {
        this.escalation = escalation;
    }

    @Override
    public String toString() {
        return "Player{" +
                "lastName='" + lastName + '\'' +
                ", jerseyNumber='" + jerseyNumber + '\'' +
                ", position=" + position +
                ", escalation=" + escalation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return lastName.equals(player.lastName);
    }

    @Override
    public int compareTo(Player otherPlayer) {
        if (Integer.parseInt(jerseyNumber) > Integer.parseInt(otherPlayer.jerseyNumber)) return 1;
        if (Integer.parseInt(jerseyNumber) < Integer.parseInt(otherPlayer.jerseyNumber)) return -1;
        return 0;
        // return jerseyNumber.compareTo(otherPlayer.jerseyNumber);
    }

    
}
