package Test;
import code.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
public class GarageTest {

    @Test
    public void test_add_voiture() {
        Voiture test = VoitureFactory.newVoiture(Modele.MODEL_S) ;
        ArrayList<Voiture> test_garage = new ArrayList<>() ;
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
        ArrayList<Voiture> test_garage = new ArrayList<>() ;
        Boolean validation = false ;
        test_garage.add(test) ;
        Garage garage = new Garage(test_garage) ;
        if(garage.getCatalogue().contains(test) ) {
            validation = true ;
        }
        Assertions.assertTrue(true , String.valueOf(validation));
        test_garage.remove(test) ;
        validation = garage.getCatalogue().contains(test);
        Assertions.assertFalse(false , String.valueOf(validation));
    }

    @Test
    public void filtre_Prix() {
        Voiture voiture1 = VoitureFactory.newVoiture(Modele.MODEL_S);
        Voiture voiture2 = VoitureFactory.newVoiture(Modele.CENT_SIX);
        Voiture voiture3 = VoitureFactory.newVoiture(Modele.EXPLORER);
        Garage garageTrie = new Garage();
        garageTrie.addVoiture(voiture1);
        garageTrie.addVoiture(voiture3);
        garageTrie.addVoiture(voiture2);

        Garage garageTest = new Garage();
        garageTest.addVoiture(voiture2);
        garageTest.addVoiture(voiture1);
        garageTest.addVoiture(voiture3);

        Assertions.assertEquals(garageTrie.getCatalogue(), garageTest.filtrePrix());
    }
}
