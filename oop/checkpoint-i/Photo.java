import java.time.LocalDate;

class Photo {
    private String title;
    private String series;
    private String captureLocation;
    private LocalDate captureDate;
    private Integer sales;

    public Photo(String title, String series, String captureLocation, LocalDate captureDate) {
        this.title = title;
        this.series = series;
        this.captureLocation = captureLocation;
        this.captureDate = captureDate;
    }

    public String getTitle() {
        return title;
    }

    public String getSeries() {
        return series;
    }

    public String getCaptureLocation() {
        return captureLocation;
    }

    public LocalDate getCaptureDate() {
        return captureDate;
    }

    public Integer getSales() {
        return sales;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void sell() {
        this.sales++;
    }

    public void sort(Integer arg) {

    }

}