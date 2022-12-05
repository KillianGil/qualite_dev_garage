package code;

import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class VoitureFactory {
    public static Voiture newVoiture(Modele modele) {
        return new Voiture(modele.getType(), modele.getMarque(), modele.getMoteur(), modele.getRoue(),
                Year.now().getValue(), 0, genImat(), Entretien.NEUVE, modele.getPrix());
    }

    private static String genImat(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0, 1, 5, 6 -> stringBuilder.append(random.nextInt(9));
                case 2, 3, 4 -> stringBuilder.append((char) (random.nextInt(26) + 'A'));
            }
        }
        return stringBuilder.toString();
    }

    public ArrayList<Modele> listModelByMarque(Marque marque) {
        ArrayList<Modele> modeles = new ArrayList<>();
        for (Modele modele : Modele.values()) {
            if (modele.getMarque().equals(marque)) {
                modeles.add(modele);
            }
        }
        return modeles;
    }
}
