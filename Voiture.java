public class Voiture {
    private Type type;
    private Marque marque;
    private Moteur moteur;
    private Roue roue;

    private int annee, kilometrage, nbMains, note, prix;
    private Entretien entretien;

    private String imatriculation;

    public Voiture(Type type, Marque marque, Moteur moteur, Roue roue, int annee, int kilometrage, String imatriculation) {
        this.type = type;
        this.marque = marque;
        this.moteur = moteur;
        this.roue = roue;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.imatriculation = imatriculation;
    }
}
