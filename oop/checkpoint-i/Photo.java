import java.time.LocalDate;

class Photo {
    private String title;
    private String series;
    private String captureLocation;
    private LocalDate captureDate;
    private Integer sales = 0;
    public boolean exhibited = false;
    private Integer rating;
    private double price = 0.0;

    public Photo(String title, String series, String captureLocation, LocalDate captureDate, Integer rating) {
        this.title = title;
        this.series = series;
        this.captureLocation = captureLocation;
        this.captureDate = captureDate;
        this.rating = rating;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSeries() {
        return this.series;
    }

    public String getCaptureLocation() {
        return this.captureLocation;
    }

    public LocalDate getCaptureDate() {
        return this.captureDate;
    }

    public Integer getSales() {
        return this.sales;
    }

    public Integer getRating() {
        return this.rating;
    }

    public double getPrice() {
        this.price = this.rating * 1000;
        return this.price;
    }

    public String isExhibited() {
        if (exhibited) {
            return "Sim, já participou de exposição";
        }
        return "Ainda não";
    }

    public void setExhibited(boolean exhibited) {
        this.exhibited = exhibited;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setSold() {
        this.price = this.rating * 1000;
        this.sales++;
    }

    @Override
    public String toString() {
        return "Dados da Foto:" + "\n" +
                "Título = " + title + "\n" +
                "Série = " + series + "\n" +
                "Local = " + captureLocation + "\n" +
                "Data = " + captureDate + "\n" +
                "Unidades Vendidas = " + sales + "\n" +
                "Já participou de Exposições? " + isExhibited() + "\n" +
                "Classificação = " + rating + " ★" + "\n" +
                "Valor = " + getPrice();
    }

    public void sortPhotos() {
        System.out.println("Fotos ordenadas por classificação");
    }
}