package code ;

import java.util.ArrayList;

public class Main {
    public static void main(String[] argvs) {
        ArrayList<Voiture> voitures = new ArrayList<>();

        for (Modele modele: Modele.values()) {
            voitures.add(VoitureFactory.newVoiture(modele));
        }

        CatalogueInterface catalogue = new CatalogueInterface(new Garage(voitures));
        catalogue.lancelejeu();
    }
}
