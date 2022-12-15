package code;

import java.util.Scanner;

public class CatalogueInterface {
    private final Scanner sc = new Scanner(System.in);
    private final Garage garage;

    public CatalogueInterface(Garage garage) {
        this.garage = garage;
    }

    /**
     * Le menu permet à l'affichage des différentes possibilités de choix tel que l'ajout, modification et supression d'une voiture.
     */
    public void menu() {
        System.out.println("""
                            _________
                           //  ||\\ \\
                     _____//___||_\\ \\___
                     )  _          _    \\
                     |_/ \\________/ \\___|__| vroum vroum\s
                    ___\\_/________\\_/______
                """);
        boolean menu = true;
        while (menu) {
            System.out.println("""
                      _____                                  _        _ _ _       _  \s
                      / ____|                                | |      | ( |_)     | | \s
                     | |  __  __ _ _ __ __ _  __ _  ___    __| | ___  | |/ _ _   _| |_\s
                     | | |_ |/ _` | '__/ _` |/ _` |/ _ \\  / _` |/ _ \\ | | | | | | | __|
                     | |__| | (_| | | | (_| | (_| |  __/ | (_| |  __/ | | | | |_| | |_\s
                      \\_____|\\__,_|_|  \\__,_|\\__, |\\___|  \\__,_|\\___| |_| |_|\\__,_|\\__|
                                              __/ |                                   \s
                                             |___/\s
                                           
                                        
                    1- Consulter le catalogue
                    2- Ajouter une voiture
                    3- Supprimer une voiture
                    4- Modifier une voiture
                    5- Quitter le garage
                    Saisir le chiffre de votre choix :
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

    /**
     * Fonction affichant le menu de modification de voiture
     */
    private void modifVoiture() {
        afficherImat("modifier");
        if (!garage.getCatalogue().isEmpty()) {
            Voiture voiture = garage.chooseVoitureByImat(sc);
                boolean modif = true;
                while (modif) {
                    System.out.println("""
                            1- Modifier roue
                            2- Modifier le nombre de mains
                            3- Modifier le prix
                            4- Modifier l'entretien
                            5- Retour au menu
                            """);
                    switch (sc.nextInt()){
                        case 1 -> modifRoue(voiture);
                        case 2 -> modifNbMains(voiture);
                        case 3 -> modifPrix(voiture);
                        case 4 -> modifEntretien(voiture);
                        case 5 -> modif = false;
                    }
                }
        }else System.out.println("Le garage est vide !");
    }

    /**
     * Fonction affichant l'entretien actuel de la voiture et permettant sa modification
     */
    private void modifEntretien(Voiture voiture) {
        System.out.println("Entretien actuel : " + voiture.getEntretien());
        voiture.setEntretien(Entretien.chooseEntretien(sc));
        System.out.println("Entretien modifie avec succes");
    }

    /**
     * Fonction affichant le prix actuel de la voiture et permettant sa modification
     */
    private void modifPrix(Voiture voiture) {
        System.out.println("Prix actuel : " + voiture.getPrix() + "\nCombien souhaitez-vous la vendre ?");
        voiture.setPrix(sc.nextInt());
        System.out.println("Prix modifie avec succes");
    }

    /**
     * Fonction affichant le nombre de main actuel de la voiture et permettant sa modification
     */
    private void modifNbMains(Voiture voiture) {
        System.out.println("Nombre de mains actuel : " + voiture.getNbMains() + "\nCombien souhaitez-vous en mettre ?");
        voiture.setNbMains(sc.nextInt());
        System.out.println("Nombre de mains modifie avec succes");
    }

    /**
     * Fonction affichant les roues actuelles de la voiture et permettant leurs modifications
     */
    private void modifRoue(Voiture voiture) {
        System.out.println("Roue actuelle : " + voiture.getRoue());
        voiture.setRoue(new Roue(Jante.chooseJante(sc), MarquePneu.chooseMarquePneu(sc)));
        System.out.println("Roue modifie avec succes");
    }

    /**
     * Fonction affichant le menu du catalogue de voitures et permet l'accès aux filtres de ce dernier
     */
    private void catalogue() {
        if (!garage.getCatalogue().isEmpty()) {
            boolean catalogue = true;
            while (catalogue) {
                System.out.println("""
                        1- Consulter le catalogue
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

    /**
     * Fonction permettant l'affichage et l'application des différents choix de filtres du catalogue
     */
    private void choixFiltre() {
        boolean filtre = true;
        while (filtre) {
            System.out.println("""
                    1- Filtrer par marque
                    2- Filtrer par prix
                    3- Filtrer par note
                    4- Filtrer par nombre de mains
                    5- Retour au menu
                    """);
            switch (sc.nextInt()) {
                case 1 -> System.out.println(garage.filtreMarque(Marque.chooseMarque(sc)));
                case 2 -> System.out.println(garage.filtrePrix());
                case 3 -> System.out.println(garage.filtreNote());
                case 4 -> {
                    System.out.println("Saisir le nombre de main souhaite ");
                    System.out.println(garage.filtreNbMain(sc.nextInt()));
                }
                case 5 -> filtre = false;
                default -> System.out.println("Veuillez choisir une option");
            }
        }
    }

    /**
     * Fonction permettant l'affichage et l'application de la supression d'une voiture par immatriculation
     */
    private void supVoiture() {
        afficherImat("supprimer");
        if (!garage.getCatalogue().isEmpty()) {
            while (true) {
                Voiture voiture = garage.getVoitureByImat(sc.next().toUpperCase());
                if (voiture != null) {
                    garage.removeVoiture(voiture);
                    System.out.println("Voiture " + voiture.getImatriculation() + " supprimer");
                    break;
                }else System.out.println("Voiture inconnue");
            }
        } else System.out.println("Le garage est vide !");
    }

    /**
     * Fonction permettant l'affichage et l'application de la supression d'une voiture par immatriculation
     * @param x Correspond à l'immatriculation de la voiture souhaité
     */
    private void afficherImat(String x) {
        System.out.println("Saisir l'immatriculation de la voiture à " + x + " :\n");
        for (int i = 0; i < garage.getCatalogue().size(); i++) {
            System.out.println(garage.getCatalogue().get(i).getMarque().nameToString() + " " + garage.getCatalogue().get(i).getImatriculation());
        }
    }

    /**
     * Fonction permettant l'affichage et l'application de l'ajout d'une nouvelle voiture
     */
    private void newVoiture() {
        Modele modele = Modele.chooseModele(sc);

        int annee = getAnInt("Annee de la voiture : ");

        int kilometrage = getAnInt("Kilometrage de la voiture : ");

        String imat;
        while (true) {
            String regex = "\\d\\d[A-Z]{3}\\d{2}";
            System.out.println("Immatriculation de la voiture : ");
            imat = sc.next().toUpperCase();
            if (imat.matches(regex)) {
                break;
            } else System.out.println("Immatriculation non conforme, \"11AAA11\" attendu");
        }

        Entretien entretien = Entretien.chooseEntretien(sc);

        int prix = getAnInt("Prix de la voiture : ");

        int nbMains = getAnInt("Nombre de mains de la voiture : ");

        Voiture newV = VoitureFactory.newVoitureOccasion(modele, annee, kilometrage, imat, entretien, prix, nbMains);
        garage.addVoiture(newV);
        System.out.println(newV);
    }

    /**
     * Fonction permettant de verifier que l'utilisateur saisi bien un entier, lui informe si le format n'est pas valide
     * @param x Demande à l'utilisateur l'ajout d'un entier ( tel qu'une année par exemple )
     */
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
}