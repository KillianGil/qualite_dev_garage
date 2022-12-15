package code;

import java.time.Year;
import java.util.Random;

public class VoitureFactory {

    /** Création d'une Voiture*/
    public static Voiture newVoiture(Modele modele) {
        return new Voiture(modele.getType(), modele.getMarque(), modele.getMoteur(), modele.getRoue(),
                Year.now().getValue(), 0, genImat(), Entretien.NEUVE, modele.getPrix());
    }

    /** Création d'une Voiture d'occasion*/
    public static Voiture newVoitureOccasion(Modele modele, int annee, int kilometrage, String imat, Entretien entretien, int prix, int nbMains) {
        return new Voiture(modele.getType(), modele.getMarque(), modele.getMoteur(), modele.getRoue(),
                annee, kilometrage, imat, entretien, prix, nbMains);
    }

    /**
     * Permet la génération d'une plaque d'immatriculation au bon format
     * @return Retourne une immatriculation aléatoirement
     */
    public static String genImat() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0, 1, 5, 6 -> stringBuilder.append((char) (random.nextInt(26) + 'A'));
                case 2, 3, 4 -> stringBuilder.append(random.nextInt(9));
            }
        }
        return stringBuilder.toString();
    }
}
