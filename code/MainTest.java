package code ;

import java.io.IOException;
import java.util.ArrayList;

public class MainTest {
    public static void main(String[] argvs) throws IOException {
        Garage garage = new Garage();
        ArrayList<Voiture> voitures = new ArrayList<>();

        voitures.add(VoitureFactory.newVoiture(Modele.CENT_SIX));
        voitures.add(VoitureFactory.newVoiture(Modele.CLASSE_G));

        garage.setCatalogue(voitures);
        System.out.println(garage);

        System.out.println(garage.filtrePrix());
        CatalogueInterface catalogue = new CatalogueInterface(garage);
        catalogue.lancelejeu();
    }
}
