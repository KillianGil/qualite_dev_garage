package Test;

import code.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class VoitureFactoryTest {

    @Test
    public void test_new_voiture() throws Exception {
        Voiture test = VoitureFactory.newVoiture(Modele.MODEL_S) ;

    }
}
