package code;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CatalogueInterface {
    private boolean menu = true;
    private Scanner sc = new Scanner(System.in);
    Garage garage;

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
                default -> {
                    System.out.println("Veuillez choisir une option");
                }
            }
        }
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
                    if(marqueV != null) System.out.println(garage.filtreMarque(marqueV));
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
        System.out.println("Selectionné la voiture à supprimer :\n");
    }

    private void newVoiture() {
        Modele modele = getModele();
        System.out.println("Année de la voiture : ");
        int annee = sc.nextInt();

        System.out.println("Kilometrage de la voiture : ");
        int kilometrage = sc.nextInt();

        System.out.println("Imatriculation de la voiture : ");
        String imat = sc.next();

        System.out.println("""
                Entretien de la voiture :\s
                1- Neuve
                2- Entrenue
                3- Pas entretenue
                4- Abimé
                5- Epave""");
        int ent = sc.nextInt();
        Entretien entretien = null;
        switch (ent){
            case 1 -> entretien = Entretien.NEUVE;
            case 2 -> entretien = Entretien.ENTRETENUE;
            case 3 -> entretien = Entretien.PASENTRETENUE;
            case 4 -> entretien = Entretien.ABIME;
            case 5 -> entretien = Entretien.EPAVE;
        }

        System.out.println("Prix de la voiture : ");
        int prix = sc.nextInt();

        System.out.println("Nombre de mains de la voiture : ");
        int nbMains = sc.nextInt();

        Voiture newV = VoitureFactory.newVoitureOccasion(modele, annee, kilometrage, imat, entretien, prix, nbMains);
        garage.addVoiture(newV);
        System.out.println(newV);
    }

    @NotNull
    private Modele getModele() {
        System.out.println("Liste des modèles possible :\n");
        for (Modele modele : Modele.values()) {
            System.out.println(modele.nameToString() + ", ");
        }
        Modele modeleV = null;
        boolean choix = true;
        while(choix) {
            System.out.println("Modèle de la voiture : ");
            String nom = sc.next();
            for (Modele modele : Modele.values()) {
                if (Objects.equals(modele.nameToString(), nom.toUpperCase())){
                    modeleV = modele;
                }
            }
            if(modeleV != null) choix = false;
            else System.out.println("Modèle inconnu");
        }
        return modeleV;
    }
}


