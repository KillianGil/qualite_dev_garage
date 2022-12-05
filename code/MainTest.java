package code ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTest {
    public static void main(String[] argvs) {
        VoitureFactory voiture = new VoitureFactory();
        Voiture centSix = VoitureFactory.newVoiture(Modele.CENT_SIX);
        System.out.println(centSix);
    }
}