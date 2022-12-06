package code;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class CatalogueInterface {
    public static InputStream InputStream;


    public static void lancelejeu() throws IOException {
        int choix;
        boolean etat_du_jeu = true;

        while (etat_du_jeu == true ) {
            System.out.println("        _______\n" +
                    "       //  ||\\ \\\n" +
                    " _____//___||_\\ \\___\n" +
                    " )  _          _    \\\n" +
                    " |_/ \\________/ \\___|__| vroum vroum \n" +
                    "___\\_/________\\_/______\n");
            System.out.println("1 - Consulter le catalogue ");
            System.out.println("2 - Ajouter une nouvelle voiture ");
            System.out.println("3 - Supprimer une voiture ");
            System.out.println("4 - Pour quitter le garage ");
            System.out.println("Rentrer le chiffre correspondant a votre choix : ");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix == 1) {
                for (Marque allMarque : Marque.values()){
                    System.out.println(allMarque);
                }
                System.out.println("Quelle marque de voiture souhaitez vous consultez?");
                String marque;
                Scanner scannerNewVoiture = new Scanner(System.in);
                marque = scannerNewVoiture.nextLine();
                switch(marque){

                    case "ALPHAROMEO":

                        break;

                    case "AUDI":
                        System.out.println("Allons, allons, Vous n'avez pas les sous pour ca...");
                        break;

                    case "PEUGEOT":
                        System.out.println("Buenos dias");
                        break;
                    default:
                        System.out.println("Cette marque n'est pas présente dans notre garage :( ");
                        break;
                }
                etat_du_jeu = false;

            }
            else if (choix == 2){

                String modele ;
                Scanner scannerNewVoiture = new Scanner(System.in);
                modele = scannerNewVoiture.nextLine();
                System.out.println("Veuillez renseigner le modele correspondant");
                if (modele == "CENTSIX"){
                    Voiture New106 = VoitureFactory.newVoiture(Modele.CENT_SIX) ;
                    System.out.println(New106);
                }

            }
            else if ( choix == 4 ) {
                etat_du_jeu = false;
            }

        }
        System.out.println("Merci de votre visite");
    }


}


