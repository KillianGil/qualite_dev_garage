package code;

import org.jetbrains.annotations.NotNull;

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
                            _______
                           //  ||\\ \\
                     _____//___||_\\ \\___
                     )  _          _    \\
                     |_/ \\________/ \\___|__| vroum vroum\s
                    ___\\_/________\\_/______
                                        
                    1- Consulter le catalogue
                    2- Ajouter une nouvelle voiture
                    3- Supprimer une voiture
                    4- Pour quitter le garage
                    Rentrer le chiffre de votre choix :
                    """);

            int choix = sc.nextInt();
            switch (choix) {
                case 1 -> catalogue();
                case 2 -> newVoiture();
                case 3 -> supVoiture();
                default -> menu = false;
            }

        }
        System.out.println("Merci de votre visite\n");
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
                    System.out.println("Entrer la marque souhaité ");
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
                    System.out.println("Entrer le nombre de main souhaité ");
                    System.out.println(garage.filtreNbMain(sc.nextInt()));
                }
                case 5 -> filtre = false;
            }
        }
    }

    private void supVoiture() {
        System.out.println("Entrée l'imatriculation de la voiture à supprimer :\n");
        for (int i = 0; i < garage.getCatalogue().size(); i++) {
            System.out.println(garage.getCatalogue().get(i).getMarque().nameToString() + " " + garage.getCatalogue().get(i).getImatriculation());
        }
        if (!garage.getCatalogue().isEmpty()) {
            boolean suppression = true;
            while (suppression) {
                String imt = sc.next().toUpperCase();
                for (Voiture voiture : garage.getCatalogue()) {
                    if (Objects.equals(voiture.getImatriculation(), imt)) {
                        garage.getCatalogue().remove(voiture);
                        System.out.println("Voiture " + voiture.getImatriculation() + " supprimer");
                        suppression = false;
                        break;
                    }
                }
                if (suppression) System.out.println("Voiture inconue");
            }
        } else System.out.println("Le garage est vide !");
    }

    private void newVoiture() {
        Modele modele = getModele();

        int annee = getAnInt("Année de la voiture : ");

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
                4- Abimé
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

    @NotNull
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


