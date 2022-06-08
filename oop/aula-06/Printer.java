import java.time.LocalDate;

public class Printer {
    private String name;
    private String connection;
    private LocalDate manufacturer;
    private int availablePaper = 0;

    public Printer(String name, String connection, LocalDate manufacturer, int availablePaper) {
        this.name = name;
        this.connection = connection;
        this.manufacturer = manufacturer;
        this.availablePaper = availablePaper;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}