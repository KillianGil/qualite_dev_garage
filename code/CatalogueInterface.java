package code;
import java.util.Objects;
import java.util.Scanner;
public class CatalogueInterface {
    private int choix;
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

            choix = sc.nextInt();
            switch (choix) {
                case 1 -> System.out.println(garage);
                case 2 -> newVoiture();
                case 3 -> supVoiture();
                default -> menu = false;
            }

        }
        System.out.println("Merci de votre visite\n");
    }

    private void supVoiture() {
        System.out.println("Selectionné la voiture à supprimer :\n");
    }



    private void newVoiture() {
        System.out.println("Model de la voiture : ");
        String nom = sc.next();
        Modele modeleV = null;
        for (Modele modele: Modele.values()) {
            if(Objects.equals(modele.nameToString(), nom)) modeleV = modele;
        }

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
        //assert modeleV != null;

        System.out.println("Prix de la voiture : ");
        int prix = sc.nextInt();

        System.out.println("Nombre de mains de la voiture : ");
        int nbMains = sc.nextInt();

        Voiture newV = VoitureFactory.newVoitureOccasion(modeleV, annee, kilometrage, imat, entretien, prix, nbMains);
        garage.addVoiture(newV);
        System.out.println(newV);
    }
}


