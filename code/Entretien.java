package code;

import java.util.Objects;
import java.util.Scanner;

public enum Entretien {
    NEUVE{
        String nameToString() {
            return "NEUVE";
        }
    },
    ENTRETENUE{
        String nameToString() {
            return "ENTRETENUE";
        }
    },
    PASENTRETENUE{
        String nameToString() {
            return "PASENTRETENUE";
        }
    },
    ABIMEE{
        String nameToString() {
            return "ABIMEE";
        }
    },
    EPAVE{
        String nameToString() {
            return "EPAVE";
        }
    };

    abstract String nameToString();

    private static Entretien findEntretien(String marque){
        for (Entretien entretien : Entretien.values()) {
            if (Objects.equals(entretien.nameToString(), marque.toUpperCase())) {
                return entretien;
            }
        }
        return null;
    }

    /**
     * Fonction permettant l'affichage des status d'entretients disponibles d'une voiture et permet sa modification selon le choix de l'utilisateur
     * @param sc Entrée clavier de l'utilisateur de l'entretien choisi
     * @return Retourne l'entretien choisi par l'utilisateur
     */
    public static Entretien chooseEntretien(Scanner sc) {
        System.out.println("Liste des statuts d'entretien possible :\n");
        for (Entretien entretien : Entretien.values()) {
            System.out.println(entretien.nameToString() + ", ");
        }

        Entretien entretien;
        while (true) {
            System.out.println("Entretien souhaité : ");
            entretien = Entretien.findEntretien(sc.next().toUpperCase());
            if(entretien != null) break;
            else System.out.println("Entretien inconnu");
        }
        return entretien;
    }
}
