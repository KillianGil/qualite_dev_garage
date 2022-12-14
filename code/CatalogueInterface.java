package code;

import java.util.Objects;
import java.util.Scanner;

public class CatalogueInterface {
    private boolean menu = true;
    private final Scanner sc = new Scanner(System.in);
    private Garage garage;

    public CatalogueInterface(Garage garage) {
        this.garage = garage;
    }

    public void lancelejeu() {
        while (menu) {
            System.out.println("""
                                        
                       _____                                  _        _ _ _       _  \s
                      / ____|                                | |      | ( |_)     | | \s
                     | |  __  __ _ _ __ __ _  __ _  ___    __| | ___  | |/ _ _   _| |_\s
                     | | |_ |/ _` | '__/ _` |/ _` |/ _ \\  / _` |/ _ \\ | | | | | | | __|
                     | |__| | (_| | | | (_| | (_| |  __/ | (_| |  __/ | | | | |_| | |_\s
                      \\_____|\\__,_|_|  \\__,_|\\__, |\\___|  \\__,_|\\___| |_| |_|\\__,_|\\__|
                                              __/ |                                   \s
                                             |___/                                    \s
                                        
                                        
                    1- Consulter le catalogue
                    2- Ajouter une voiture
                    3- Supprimer une voiture
                    4- Modifier une voiture
                    5- Quitter le garage
                    Rentrer le chiffre de votre choix :
                    """);

            switch (sc.nextInt()) {
                case 1 -> catalogue();
                case 2 -> newVoiture();
                case 3 -> supVoiture();
                case 4 -> modifVoiture();
                default -> menu = false;
            }
        }
        System.out.println("Merci de votre visite\n");
    }

    private void modifVoiture() {
        afficherImat("modifier");
        if (!garage.getCatalogue().isEmpty()) {
            Voiture voiture;
            while (true) {
                voiture = garage.getVoitureByImat(sc.next().toUpperCase());
                if (voiture != null){
                        System.out.println("""
                                1- Modifier roue
                                2- Modifier nombre de mains
                                3- Modifier prix
                                4- Modifier l'entretien
                                """);
                        switch (sc.nextInt()){
                            case 1 -> modifRoue(voiture);
                            case 2 -> modifNbMains(voiture);
                            case 3 -> modifPrix(voiture);
                            case 4 -> modifEntretien(voiture);
                        }
                        break;
                }else System.out.println("Voiture inconue");
            }
        }else System.out.println("Le garage est vide !");
    }

    private void modifEntretien(Voiture voiture) {
        System.out.println("Entretient actuel : " + voiture.getEntretien());
        System.out.println("Liste des Entretien possible :\n");
        for (Entretien entretien : Entretien.values()) {
            System.out.println(entretien.nameToString() + ", ");
        }

        Entretien entretien;
        while (true) {
            System.out.println("Marque des pneux souhaité : ");
            entretien = Entretien.findEntretien(sc.next().toUpperCase());
            if(entretien != null) break;
            else System.out.println("Entretien inconnu");
        }

        voiture.setEntretien(entretien);
        System.out.println("Entretien modifie avec succes");
    }

    private void modifPrix(Voiture voiture) {
        System.out.println("Prix actuel : " + voiture.getPrix() + "\nCombien souhaité vous la vendre ?");
        voiture.setPrix(sc.nextInt());
        System.out.println("Prix modifie avec succes");
    }

    private void modifNbMains(Voiture voiture) {
        System.out.println("Nombre de mains actuel : " + voiture.getNbMains() + "\nCombien souhaité vous en mettre ?");
        voiture.setNbMains(sc.nextInt());
        System.out.println("Nombre de mains modifie avec succes");
    }


    private void modifRoue(Voiture voiture) {
        System.out.println("Roue actuel : " + voiture.getRoue());
        System.out.println("Liste des marques de pneu disponible :\n");
        for (MarquePneu marquePneu : MarquePneu.values()) {
            System.out.println(marquePneu.nameToString() + ", ");
        }

        MarquePneu marquePneu;
        while (true) {
            System.out.println("Marque des pneux souhaité : ");
            marquePneu = MarquePneu.findMarquePneu(sc.next().toUpperCase());
            if(marquePneu != null) break;
            else System.out.println("Modèle inconnu");
        }

        System.out.println("Liste des taille de jantes disponible :\n");
        for (Jante jante : Jante.values()) {
            System.out.println(jante.nameToString() + ", ");
        }

        Jante jante;
        while (true){
            System.out.println("Taille des jantes souhaité: ");
            jante = Jante.findJante(sc.next().toUpperCase());
            if(jante != null) break;
            else System.out.println("Taille inconnu");
        }

        voiture.setRoue(new Roue(jante, marquePneu));
        System.out.println("Roue modifie avec succes");
    }

    private void catalogue() {
        if (!garage.getCatalogue().isEmpty()) {
            boolean catalogue = true;
            while (catalogue) {
                System.out.println("""
                        1- Consuter le catalogue
                        2- Appliquer des filtres
                        3- Retour au menu
                        """);
                switch (sc.nextInt()) {
                    case 1 -> System.out.println(garage);
                    case 2 -> choixFiltre();
                    case 3 -> catalogue = false;
                    default -> System.out.println("Veuillez choisir une option");
                }
            }
        } else System.out.println("Le garage est vide !");
    }

    private void choixFiltre() {
        boolean filtre = true;
        while (filtre) {
            System.out.println("""
                    1- Filtrer par marque
                    2- Filtrer par prix
                    3- Filtrer par note
                    4- Filtrer par nombre de main
                    5- Retour au menu
                    """);
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Entrer la marque souhaite ");
                    Marque marqueV = null;
                    String nom = sc.next();
                    for (Marque marque : Marque.values()) {
                        if (Objects.equals(marque.nameToString(), nom.toUpperCase())) marqueV = marque;
                    }
                    if (marqueV != null) System.out.println(garage.filtreMarque(marqueV));
                    else System.out.println("Marque non disponible");
                }
                case 2 -> System.out.println(garage.filtrePrix());
                case 3 -> System.out.println(garage.filtreNote());
                case 4 -> {
                    System.out.println("Entrer le nombre de main souhaite ");
                    System.out.println(garage.filtreNbMain(sc.nextInt()));
                }
                case 5 -> filtre = false;
            }
        }
    }

    private void supVoiture() {
        afficherImat("supprimer");
        if (!garage.getCatalogue().isEmpty()) {
            while (true) {
                Voiture voiture = garage.getVoitureByImat(sc.next().toUpperCase());
                if (voiture != null) {
                    garage.removeVoiture(voiture);
                    System.out.println("Voiture " + voiture.getImatriculation() + " supprimer");
                    break;
                }else System.out.println("Voiture inconue");
            }
        } else System.out.println("Le garage est vide !");
    }

    private void afficherImat(String x) {
        System.out.println("Entree l'imatriculation de la voiture à " + x + " :\n");
        for (int i = 0; i < garage.getCatalogue().size(); i++) {
            System.out.println(garage.getCatalogue().get(i).getMarque().nameToString() + " " + garage.getCatalogue().get(i).getImatriculation());
        }
    }

    private void newVoiture() {
        Modele modele = getModele();

        int annee = getAnInt("Annee de la voiture : ");

        int kilometrage = getAnInt("Kilometrage de la voiture : ");

        String imat;
        while (true) {
            String regex = "\\d\\d[A-Z]{3}\\d{2}";
            System.out.println("Imatriculation de la voiture : ");
            imat = sc.next().toUpperCase();
            if (imat.matches(regex)) {
                break;
            } else System.out.println("Imatriculation non conforme, \"11AAA11\" attendu");
        }

        System.out.println("""
                Entretien de la voiture :\s
                1- Neuve
                2- Entrenue
                3- Pas entretenue
                4- Abime
                5- Epave""");
        int ent = sc.nextInt();
        Entretien entretien = null;
        switch (ent) {
            case 1 -> entretien = Entretien.NEUVE;
            case 2 -> entretien = Entretien.ENTRETENUE;
            case 3 -> entretien = Entretien.PASENTRETENUE;
            case 4 -> entretien = Entretien.ABIME;
            case 5 -> entretien = Entretien.EPAVE;
        }

        int prix = getAnInt("Prix de la voiture : ");

        int nbMains = getAnInt("Nombre de mains de la voiture : ");

        Voiture newV = VoitureFactory.newVoitureOccasion(modele, annee, kilometrage, imat, entretien, prix, nbMains);
        garage.addVoiture(newV);
        System.out.println(newV);
    }

    private int getAnInt(String x) {
        int integer;
        System.out.println(x);

        while (true) {
            if (sc.hasNextInt()) {
                integer = sc.nextInt();
                break;
            } else {
                System.out.println("Format non valable, entrer un entier");
                sc.next();
            }
        }
        return integer;
    }

    private Modele getModele() {
        System.out.println("Liste des modèles possible :\n");
        for (Modele modele : Modele.values()) {
            System.out.println(modele.nameToString() + ", ");
        }
        Modele modeleV = null;
        boolean choix = true;
        while (choix) {
            System.out.println("Modèle de la voiture : ");
            String nom = sc.next();
            for (Modele modele : Modele.values()) {
                if (Objects.equals(modele.nameToString(), nom.toUpperCase())) {
                    modeleV = modele;
                }
            }
            if (modeleV != null) choix = false;
            else System.out.println("Modèle inconnu");
        }
        return modeleV;
    }
}