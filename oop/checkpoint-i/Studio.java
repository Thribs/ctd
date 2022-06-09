import java.util.List;
import java.util.ArrayList;

class Studio {
    private List<Photo> photos;
    private List<Client> clients;
    private List<Exposition> expositions;

    public Studio() {
        this.photos = new ArrayList<Photo>();
        this.clients = new ArrayList<Client>();
        this.expositions = new ArrayList<Exposition>();
    }

    public Double getSalesTotal() {
        Double total = 0.0;

        return total;
    }

    public List<String> getBestPhotos() {
        List<String> bestPhotos = new ArrayList<String>();

        return bestPhotos;
    }

}