public class Voiture {
    private final Type type;
    private final Marque marque;
    private final Moteur moteur;
    private final Roue roue;

    private int annee, kilometrage, nbMains, note, prix;
    private Entretien entretien;

    private final String imatriculation;

    public Voiture(Type type, Marque marque, Moteur moteur, Roue roue, int annee, int kilometrage, String imatriculation) {
        this.type = type;
        this.marque = marque;
        this.moteur = moteur;
        this.roue = roue;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.imatriculation = imatriculation;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "type=" + type +
                ", marque=" + marque +
                ", "+ moteur +
                ", " + roue +
                ", annee=" + annee +
                ", kilometrage=" + kilometrage +
                ", nbMains=" + nbMains +
                ", note=" + note +
                ", prix=" + prix +
                ", entretien=" + entretien +
                ", imatriculation='" + imatriculation + '\'' +
                '}';
    }
}
