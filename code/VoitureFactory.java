package code;

import java.time.Year;
import java.util.Random;

public class VoitureFactory {
    public static Voiture newVoiture(Modele modele) {
        return new Voiture(modele.getType(), modele.getMarque(), modele.getMoteur(), modele.getRoue(),
                Year.now().getValue(), 0, genImat(), Entretien.NEUVE, modele.getPrix());
    }

    public static Voiture newVoitureOccasion(Modele modele, int annee, int kilometrage, String imat, Entretien entretien, int prix, int nbMains) {
        return new Voiture(modele.getType(), modele.getMarque(), modele.getMoteur(), modele.getRoue(),
                annee, kilometrage, imat, entretien, prix, nbMains);
    }

    private static String genImat() {
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
}
