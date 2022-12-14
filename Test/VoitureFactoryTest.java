package Test;

import code.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class VoitureFactoryTest {

    @Test
    public void test_new_voiture() {
        Voiture test = VoitureFactory.newVoiture(Modele.MODEL_S) ;
        ArrayList<Voiture> test_garage = new ArrayList<>() ;
        test_garage.add(test) ;
        Boolean validation = false ;
        Garage garage = new Garage(test_garage) ;
        if(garage.getCatalogue().contains(test) ) {
            validation = true ;
        }
        Assertions.assertTrue(true , String.valueOf(validation));
        Voiture test4 = garage.getCatalogue().get(0) ;
        Assertions.assertEquals( Entretien.NEUVE , test4.getEntretien());

    }
    @Test
    public void test_new_voiture_occasion() {
        Voiture test2 = VoitureFactory.newVoitureOccasion(Modele.MODEL_S , 2022 , 42000 , "11AAA11" , Entretien.PASENTRETENUE , 138990 , 0) ;
        ArrayList<Voiture> test_garage = new ArrayList<>() ;
        test_garage.add(test2) ;
        Boolean validation = false ;
        Garage garage = new Garage(test_garage) ;
        if(garage.getCatalogue().contains(test2) ) {
            validation = true ;
        }
        Assertions.assertTrue(true , String.valueOf(validation));
        Voiture test3 = garage.getCatalogue().get(0) ;
        Assertions.assertEquals( Entretien.PASENTRETENUE , test3.getEntretien());
    }

    @Test
    public void test_gen_imat() {
        String test = code.VoitureFactory.genImat() ;
        String regex = "\\d\\d[A-Z]{3}\\d{2}" ;
        boolean validation = test.matches(regex);
        Assertions.assertTrue(validation);
    }


}
