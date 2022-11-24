public class MainTest {
    public static void main(String[] argvs){
        VoitureFactory voiture = new VoitureFactory();
        Voiture centSix = voiture.newVoiture(Model.CENT_SIX);
        System.out.println(centSix);
    }
}
