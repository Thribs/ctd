import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Studio studio = new Studio();

        Photo blue = new Photo(
                "Blue",
                "Colors",
                "Australia",
                LocalDate.of(2000, 01, 01),
                4);
        Photo orange = new Photo(
                "Orange",
                "Colors",
                "Australia",
                LocalDate.of(2000, 01, 01),
                5);
        Photo violet = new Photo(
                "Violet",
                "Colors",
                "Australia",
                LocalDate.of(2000, 01, 01),
                3);

        Client john = new Client(
                "John",
                "123.456.789-00",
                "+5511999999999",
                "john@photomail.com");

        Client jane = new Client(
                "Jane", "123.456.789-00", "+5511999999999", "jane@photomail.com");

        Client jackie = new Client(
                "Jackie", "123.456.789-00", "+5511999999999", "jackie@photomail.com");

        Client jose = new Client(
                "Jose", "123.456.789-00", "+5511999999999", "jose@photomail.com");

        Exhibition moma = new Exhibition(
                "Museum of Modern Art",
                "New York City",
                LocalDate.of(2000, 01, 01),
                LocalDate.of(2000, 01, 05));

        Exhibition mam = new Exhibition(
                "Museu de arte moderna de São Paulo",
                "São Paulo",
                LocalDate.of(2000, 01, 01),
                LocalDate.of(2000, 01, 03));

        Exhibition tateModern = new Exhibition(
                "Tate Modern",
                "London",
                LocalDate.of(2000, 02, 01),
                LocalDate.of(2000, 02, 05));

        studio.addPhoto(blue);
        System.out.println("Foto " + blue.getTitle() + " adquirida pelo estúdio.");
        studio.addPhoto(orange);
        System.out.println("Foto " + orange.getTitle() + " adquirida pelo estúdio.");
        studio.addPhoto(violet);
        System.out.println("Foto " + violet.getTitle() + " adquirida pelo estúdio.");

        studio.addClient(john);
        System.out.println("Cliente " + john.getName() + " é um novo cliente do estúdio.");
        studio.addClient(jane);
        System.out.println("Cliente " + jane.getName() + " é um novo cliente do estúdio.");
        studio.addClient(jackie);
        System.out.println("Cliente " + jackie.getName() + " é um novo cliente do estúdio.");

        studio.addExhibition(moma);
        System.out.println("Exposição " + moma.getName() + " irá exibir as obras do estúdio em ." + moma.getCity()
                + " no dia " + moma.getStartingDate() + ".");
        studio.addExhibition(mam);
        System.out.println("Exposição " + mam.getName() + " irá exibir as obras do estúdio em ." + mam.getCity()
                + " no dia " + mam.getStartingDate() + ".");
        studio.addExhibition(tateModern);
        System.out.println(
                "Exposição " + tateModern.getName() + " irá exibir as obras do estúdio em ." + tateModern.getCity()
                        + " no dia " + tateModern.getStartingDate() + ".");

        moma.borrow(blue);
        System.out.println("Foto " + blue.getTitle() + " foi alugada para a exposição " + moma.getName() + ".");
        moma.borrow(orange);
        System.out.println("Foto " + orange.getTitle() + " foi alugada para a exposição " + moma.getName() + ".");

        jane.purchase(violet);
        System.out.println("Foto " + violet.getTitle() + " foi vendida para o(a) cliente " + jane.getName() + " por R$"
                + violet.getPrice() + ".");

        System.out.println("Total de vendas do estúdio: " + studio.getSalesTotal());
        System.out.println("Melhores fotos do estúdio: " + studio.getBestPhotos());
    }

}