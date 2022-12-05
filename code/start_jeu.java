package code;
import java.io.InputStream;
import java.util.Scanner;
public class start_jeu {
    public static InputStream InputStream;


    public static void lancelejeu() {
        int choix;
        boolean etat_du_jeu = true;

        while (etat_du_jeu == true ) {
            System.out.println("Bienvenue dans le garage de l'IUT");
            System.out.println("1 - Consulter le catalogue ");
            System.out.println("2 - Ajouter une nouvelle voiture ");
            System.out.println("3 - Supprimer une voiture ");
            System.out.println("4 - Pour quitter le garage ");
            System.out.println("Rentrer le chiffre correspondant a votre choix : ");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix == 1) {

                Voiture centSix = VoitureFactory.newVoiture(Modele.CENT_SIX);
                System.out.println(centSix) ;

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


