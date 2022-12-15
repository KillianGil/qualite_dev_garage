package code;

import java.util.Objects;
import java.util.Scanner;

public enum Marque {
    ALPHAROMEO {
        String nameToString() {
            return "ALPHAROMEO";
        }
    },
    AUDI {
        String nameToString() {
            return "AUDI";
        }
    },
    BMW {
        String nameToString() {
            return "BMW";
        }
    },
    FIAT {
        String nameToString() {
            return "FIAT";
        }
    },
    FORD {
        String nameToString() {
            return "FORD";
        }
    },
    NISSAN {
        String nameToString() {
            return "NISSAN";
        }
    },
    PEUGEOT {
        String nameToString() {
            return "PEUGEOT";
        }
    },
    TOYOTA {
        String nameToString() {
            return "TOYOTA";
        }
    },
    TESLA {
        String nameToString() {
            return "TESLA";
        }
    },
    MERCEDES {
        String nameToString() {
            return "MERCEDES";
        }
    },
    RENAULT {
        String nameToString() {
            return "RENAULT";
        }
    };

    abstract String nameToString();

    private static Marque findMarque(String marqueVoiture){
        for (Marque marque : Marque.values()) {
            if (Objects.equals(marque.nameToString(), marqueVoiture.toUpperCase())) {
                return marque;
            }
        }
        return null;
    }

    /**
     * Fonction permettant l'affichage des marques disponibles d'une voiture et permet sa modification selon le choix de l'utilisateur
     * @param sc Entrée clavier de l'utilisateur de la marque choisie
     * @return Retourne la marque choisie par l'utilisateur
     */
    public static Marque chooseMarque (Scanner sc){
        System.out.println("Marque disponible");
        for (Marque marque : Marque.values()) {
            System.out.println(marque.nameToString() + ", ");
        }

        Marque marque;
        while(true) {
            System.out.println("Entrer la marque souhaite ");
            marque = Marque.findMarque(sc.next());
            if (marque != null) break;
            else System.out.println("Marque non disponible");
        }
        return marque;
    }
}
