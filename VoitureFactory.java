import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class VoitureFactory {
    public static Voiture newVoiture(Model model, int consomation) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(random.nextInt(9)).append(random.nextInt(9));
        Voiture voiture = new Voiture(Model.CENT_SIX.getType(),Model.CENT_SIX.getMarque(), Model.CENT_SIX.getMoteur(), Model.CENT_SIX.getRoue(),
                Year.now().getValue(), 0, );
    }

    public ArrayList<Model> listModelByMarque(Marque marque) {
        ArrayList<Model> models = new ArrayList<Model>();
        for (Model model : Model.values()) {
            if (model.getMarque().equals(marque)) {
                models.add(model);
            }
        }

        return models;
    }
}
