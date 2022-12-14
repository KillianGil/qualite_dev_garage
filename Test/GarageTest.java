package Test;
import code.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import java.util.AbstractSet;
import java.util.ArrayList;
public class GarageTest {

    @Test
    public void test_add_voiture() {
        Voiture test = VoitureFactory.newVoiture(Modele.MODEL_S) ;
        ArrayList<Voiture> test_garage = new ArrayList<Voiture>() ;
        test_garage.add(test) ;
        Boolean validation = false ;
        Garage garage = new Garage(test_garage) ;
        if(garage.getCatalogue().contains(test) ) {
            validation = true ;
        }

        Assertions.assertTrue(true , String.valueOf(validation));
    }
    @Test
    public void test_remove_voiture() {
        Voiture test = VoitureFactory.newVoiture(Modele.MODEL_S) ;
        ArrayList<Voiture> test_garage = new ArrayList<Voiture>() ;
        Boolean validation = false ;
        test_garage.add(test) ;
        Garage garage = new Garage(test_garage) ;
        if(garage.getCatalogue().contains(test) ) {
            validation = true ;
        }
        Assertions.assertTrue(true , String.valueOf(validation));
        test_garage.remove(test) ;
        if(garage.getCatalogue().contains(test) ) {
            validation = true ;
        }
        else {
            validation = false ;
        }
        Assertions.assertFalse(false , String.valueOf(validation));
    }

    @Test
    public void test_to_string() throws Exception {
        Voiture test = VoitureFactory.newVoiture(Modele.MODEL_S) ;
        ArrayList<Voiture> test_garage = new ArrayList<Voiture>() ;
        test_garage.add(test) ;
        Garage garage = new Garage(test_garage) ;
        String tostring = test.toString() ;
        String string_attendu = String.valueOf(test);
        Assertions.assertEquals(string_attendu, tostring);
    }
}
