import java.util.List;
import java.util.ArrayList;

class Studio {
    private List<Photo> photos;
    private List<Client> clients;
    private List<Exhibition> exhibitions;

    public Studio() {
        this.photos = new ArrayList<Photo>();
        this.clients = new ArrayList<Client>();
        this.exhibitions = new ArrayList<Exhibition>();
    }

    public Double getSalesTotal() {
        Double total = 0.0;
        for (Photo photo : photos) {
            total += photo.getPrice() * photo.getSales();
        }
        return total;
    }

    public List<String> getBestPhotos() {
        List<String> bestPhotos = new ArrayList<String>();
        
        Integer bestRating = 0;
        for (Photo photo : photos) {
            if (photo.getRating() > bestRating) {
                bestRating = photo.getRating();
            }
        }

        for (Photo photo : photos) {
            if (photo.getRating() == bestRating) {
                bestPhotos.add(photo.getTitle());
            }
        }

        return bestPhotos;
    }

    public void addPhoto(Photo blue) {
        this.photos.add(blue);
    }

    public void addClient(Client john) {
        this.clients.add(john);
    }

    public void addExhibition(Exhibition moma) {
        this.exhibitions.add(moma);
    }



}