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
    ABIME{
        String nameToString() {
            return "ABIME";
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

    public static Entretien chooseEntretien(Scanner sc) {
        System.out.println("Liste des Entretien possible :\n");
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
