import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class VoitureFactory {
    public static Voiture newVoiture(Model model) {
        return new Voiture(model.getType(),model.getMarque(), model.getMoteur(), model.getRoue(),
                Year.now().getValue(), 0, genImat());
    }

    private static String genImat(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0, 1, 5, 6 -> stringBuilder.append(random.nextInt(9));
                case 2, 3, 4 -> stringBuilder.append((char) (random.nextInt(26) + 'A'));
            }
        }
        return stringBuilder.toString();
    }

    public ArrayList<Model> listModelByMarque(Marque marque) {
        ArrayList<Model> models = new ArrayList<>();
        for (Model model : Model.values()) {
            if (model.getMarque().equals(marque)) {
                models.add(model);
            }
        }
        return models;
    }


}
