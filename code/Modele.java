package code;

import java.util.Objects;
import java.util.Scanner;

public enum Modele {
    CENT_SIX {
        Marque getMarque() {
            return Marque.PEUGEOT;
        }

        Roue getRoue() {
            return new Roue(Jante.TREIZE_POUCES, MarquePneu.MICHELIN);
        }

        Type getType() {
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(4, 70, 6.10, Propultion.SP95);
        }

        int getPrix() {
            return 2200;
        }

        String nameToString() {
            return "106";
        }
    },
    TROIS_CENT_HUIT {
        Marque getMarque() {
            return Marque.PEUGEOT;
        }

        Roue getRoue() {
            return new Roue(Jante.SEIZE_POUCES, MarquePneu.MICHELIN);
        }

        Type getType() {
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 155, 4.8, Propultion.DIESEL);
        }

        int getPrix() {
            return 37870;
        }

        String nameToString() {
            return "308";
        }
    },
    MILLE_SEPT_CENT_CINQUANTE {
        Marque getMarque() {
            return Marque.ALPHAROMEO;
        }

        Roue getRoue() {
            return new Roue(Jante.QUATORZE_POUCES, MarquePneu.PIRELLI);
        }

        Type getType() {
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(10, 115, 11, Propultion.ESSENCE);
        }

        int getPrix() {
            return 49000;
        }

        String nameToString() {
            return "1750";
        }
    },
    GIULIA {
        Marque getMarque() {
            return Marque.ALPHAROMEO;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.PIRELLI);
        }

        Type getType() {
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(11, 200, 9.2, Propultion.ESSENCE);
        }

        int getPrix() {
            return 48089;
        }

        String nameToString() {
            return "GIULIA";
        }
    },
    R_HUIT_GT {
        Marque getMarque() {
            return Marque.AUDI;
        }

        Roue getRoue() {
            return new Roue(Jante.VINGT_POUCES, MarquePneu.BRIDGESTONE);
        }

        Type getType() {
            return Type.COUPE;
        }

        Moteur getMoteur() {
            return new Moteur(49, 620, 15, Propultion.ESSENCE);
        }

        int getPrix() {
            return 245000;
        }

        String nameToString() {
            return "R8_GT";
        }
    },
    A_SIX {
        Marque getMarque() {
            return Marque.AUDI;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_SEPT_POUCES, MarquePneu.CONTINENTAL);
        }

        Type getType() {
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 136, 8.3, Propultion.DIESEL);
        }

        int getPrix() {
            return 59080;
        }

        String nameToString() {
            return "A6";
        }
    },
    SERIE_UN {
        Marque getMarque() {
            return Marque.BMW;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.CONTINENTAL);
        }

        Type getType() {
            return Type.COUPE;
        }

        Moteur getMoteur() {
            return new Moteur(15, 265, 7, Propultion.ESSENCE);
        }

        int getPrix() {
            return 30200;
        }

        String nameToString() {
            return "SERIE_1";
        }
    },
    X_TROIS {
        Marque getMarque() {
            return Marque.BMW;
        }

        Roue getRoue() {
            return new Roue(Jante.VINGT_POUCES, MarquePneu.CONTINENTAL);
        }

        Type getType() {
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(16, 265, 9.3, Propultion.ESSENCE);
        }

        int getPrix() {
            return 52100;
        }

        String nameToString() {
            return "X3";
        }
    },
    CINQ_CENT_ABARTH {
        Marque getMarque() {
            return Marque.FIAT;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_SEPT_POUCES, MarquePneu.PIRELLI);
        }

        Type getType() {
            return Type.SPORT;
        }

        Moteur getMoteur() {
            return new Moteur(9, 160, 6.6, Propultion.ESSENCE);
        }

        int getPrix() {
            return 28200;
        }

        String nameToString() {
            return "500_ABARTH";
        }
    },
    MULTIPLA {
        Marque getMarque() {
            return Marque.FIAT;
        }

        Roue getRoue() {
            return new Roue(Jante.QUINZE_POUCES, MarquePneu.PIRELLI);
        }

        Type getType() {
            return Type.FOURGONNETTE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 120, 1.9, Propultion.DIESEL);
        }

        int getPrix() {
            return 3400;
        }

        String nameToString() {
            return "MULTIPLA";
        }
    },
    MUSTANG_SOIXANTE_NEUF {
        Marque getMarque() {
            return Marque.FORD;
        }

        Roue getRoue() {
            return new Roue(Jante.QUINZE_POUCES, MarquePneu.CONTINENTAL);
        }

        Type getType() {
            return Type.SPORT;
        }

        Moteur getMoteur() {
            return new Moteur(27, 330, 17.7, Propultion.ESSENCE);
        }

        int getPrix() {
            return 65990;
        }

        String nameToString() {
            return "MUSTANG_69";
        }
    },
    EXPLORER {
        Marque getMarque() {
            return Marque.FORD;
        }

        Roue getRoue() {
            return new Roue(Jante.VINGT_POUCES, MarquePneu.CONTINENTAL);
        }

        Type getType() {
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(32, 457, 3.1, Propultion.HYBRIDE);
        }

        int getPrix() {
            return 86400;
        }

        String nameToString() {
            return "EXPLORER";
        }
    },
    PRIMASTAR_COMBI {
        Marque getMarque() {
            return Marque.NISSAN;
        }

        Roue getRoue() {
            return new Roue(Jante.SEIZE_POUCES, MarquePneu.GOODYEAR);
        }

        Type getType() {
            return Type.MINIBUS;
        }

        Moteur getMoteur() {
            return new Moteur(8, 150, 7.2, Propultion.DIESEL);
        }

        int getPrix() {
            return 24675;
        }

        String nameToString() {
            return "PRIMASTAR_COMBI";
        }
    },
    JUKE {
        Marque getMarque() {
            return Marque.NISSAN;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_NEUF_POUCES, MarquePneu.GOODYEAR);
        }

        Type getType() {
            return Type.BREAK;
        }

        Moteur getMoteur() {
            return new Moteur(6, 114, 5.8, Propultion.SP95);
        }

        int getPrix() {
            return 22190;
        }

        String nameToString() {
            return "JUKE";
        }
    },
    YARIS {
        Marque getMarque() {
            return Marque.TOYOTA;
        }

        Roue getRoue() {
            return new Roue(Jante.SEIZE_POUCES, MarquePneu.GOODYEAR);
        }

        Type getType() {
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(4, 92, 5.7, Propultion.SP95);
        }

        int getPrix() {
            return 18650;
        }

        String nameToString() {
            return "YARIS";
        }
    },
    MODEL_S {
        Marque getMarque() {
            return Marque.TESLA;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_NEUF_POUCES, MarquePneu.CONTINENTAL);
        }

        Type getType() {
            return Type.SPORT;
        }

        Moteur getMoteur() {
            return new Moteur(4, 1020, 0, Propultion.ELECTRIQUE);
        }

        int getPrix() {
            return 138990;
        }

        String nameToString() {
            return "MODEL_S";
        }
    },
    MODEL_Y {
        Marque getMarque() {
            return Marque.TESLA;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_NEUF_POUCES, MarquePneu.CONTINENTAL);
        }

        Type getType() {
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(11, 462, 0, Propultion.ELECTRIQUE);
        }

        int getPrix() {
            return 49990;
        }

        String nameToString() {
            return "MODEL_Y";
        }
    },
    CLASSE_C {
        Marque getMarque() {
            return Marque.MERCEDES;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.BRIDGESTONE);
        }

        Type getType() {
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(11, 204, 6.5, Propultion.HYBRIDE);
        }

        int getPrix() {
            return 58000;
        }

        String nameToString() {
            return "CLASSE_C";
        }
    },
    CLASSE_G {
        Marque getMarque() {
            return Marque.MERCEDES;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.BRIDGESTONE);
        }

        Type getType() {
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(17, 245, 9.9, Propultion.DIESEL);
        }

        int getPrix() {
            return 149650;
        }

        String nameToString() {
            return "CLASSE_G";
        }
    },
    KANGOO {
        Marque getMarque() {
            return Marque.RENAULT;
        }

        Roue getRoue() {
            return new Roue(Jante.QUINZE_POUCES, MarquePneu.MICHELIN);
        }

        Type getType() {
            return Type.FOURGONNETTE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 114, 6.2, Propultion.ESSENCE);
        }

        int getPrix() {
            return 25900;
        }

        String nameToString() {
            return "KANGOO";
        }
    },
    ARKANA {
        Marque getMarque() {
            return Marque.RENAULT;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.MICHELIN);
        }

        Type getType() {
            return Type.CROSSOVER;
        }

        Moteur getMoteur() {
            return new Moteur(7, 140, 4.9, Propultion.ESSENCE);
        }

        int getPrix() {
            return 31300;
        }

        String nameToString() {
            return "ARKANA";
        }
    };


    abstract Moteur getMoteur();

    abstract Type getType();

    abstract Marque getMarque();

    abstract Roue getRoue();

    abstract int getPrix();

    abstract String nameToString();

    private static Modele findModele(String modeleVoiture){
        for (Modele modele : Modele.values()) {
            if (Objects.equals(modele.nameToString(), modeleVoiture.toUpperCase())) {
                return modele;
            }
        }
        return null;
    }

    /**
     * Fonction permettant l'affichage des modèles disponibles d'une voiture et permet sa modification selon le choix de l'utilisateur
     * @param sc Entrée clavier de l'utilisateur du modèle choisi
     * @return Retourne le modèle choisi par l'utilisateur
     */
    public static Modele chooseModele(Scanner sc) {
        System.out.println("Liste des Modele possible :\n");
        for (Modele modele : Modele.values()) {
            System.out.println(modele.nameToString() + ", ");
        }

        Modele modele;
        while (true) {
            System.out.println("Modele souhaité : ");
            modele = Modele.findModele(sc.next().toUpperCase());
            if(modele != null) break;
            else System.out.println("Modele inconnu");
        }
        return modele;
    }
}
