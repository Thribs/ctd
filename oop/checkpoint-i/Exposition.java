import java.time.LocalDate;

class Exposition {
    private String name;
    private String location;
    private LocalDate startingDate;
    private LocalDate endingDate;

    public Exposition(String name, String location, LocalDate startingDate, LocalDate endingDate) {
        this.name = name;
        this.location = location;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public void lend() {
        
    }
}