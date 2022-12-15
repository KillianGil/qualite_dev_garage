package code;

import java.util.Objects;
import java.util.Scanner;

public enum MarquePneu {
    MICHELIN{
        String nameToString() {
            return "MICHELIN";
        }
    },
    GOODYEAR{
        String nameToString() {
            return "GOODYEAR";
        }
    },
    BRIDGESTONE{
        String nameToString() {
            return "BRIDGESTONE";
        }
    },
    PIRELLI{
        String nameToString() {
            return "PIRELLI";
        }
    },
    CONTINENTAL {
        String nameToString() {
            return "CONTINENTAL";
        }
    };

    abstract String nameToString();

    private static MarquePneu findMarquePneu(String marque){
        for (MarquePneu marquePneu : MarquePneu.values()) {
            if (Objects.equals(marquePneu.nameToString(), marque.toUpperCase())) {
                return marquePneu;
            }
        }
        return null;
    }
    /**
     * Fonction permettant l'affichage des marques de pneus disponibles d'une voiture et permet sa modification selon le choix de l'utilisateur
     * @param sc Entrée clavier de l'utilisateur de la marque de pneu choisie
     * @return Retourne la marque de pneu choisie par l'utilisateur
     */
    public static MarquePneu chooseMarquePneu(Scanner sc){
        System.out.println("Liste des marques de pneus disponibles :\n");
        for (MarquePneu marquePneu : MarquePneu.values()) {
            System.out.println(marquePneu.nameToString() + ", ");
        }

        MarquePneu marquePneu;
        while (true) {
            System.out.println("Marque des pneus souhaites : ");
            marquePneu = MarquePneu.findMarquePneu(sc.next().toUpperCase());
            if(marquePneu != null) break;
            else System.out.println("Modèle inconnu");
        }
        return marquePneu;
    }
}
