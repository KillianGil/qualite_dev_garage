package code;


import java.time.Year;
import java.util.Objects;


public class Voiture implements Estimable, Notable {
    private final Type type;
    private final Marque marque;
    private final Moteur moteur;
    private final Roue roue;

    private final int annee, kilometrage, nbMains;
    private int prix;
    private double note = 5.0;

    private final Entretien entretien;
    private final String imatriculation;

    public Voiture(Type type, Marque marque, Moteur moteur, Roue roue, int annee, int kilometrage, String imatriculation, Entretien entretien, int prixNeuve) {
        this.type = type;
        this.marque = marque;
        this.moteur = moteur;
        this.roue = roue;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.imatriculation = imatriculation;
        this.entretien = entretien;
        this.prix = prixNeuve;
        estimer();
        this.nbMains = 0;
        noter();
    }

    public Voiture(Type type, Marque marque, Moteur moteur, Roue roue, int annee, int kilometrage, String imatriculation, Entretien entretien, int prixNeuve, int nbMains) {
        this.type = type;
        this.marque = marque;
        this.moteur = moteur;
        this.roue = roue;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.imatriculation = imatriculation;
        this.entretien = entretien;
        this.prix = prixNeuve;
        estimer();
        this.nbMains = nbMains;
        noter();
    }

    public Marque getMarque() {
        return marque;
    }

    public int getNbMains() {
        return nbMains;
    }

    public double getNote() {
        return note;
    }

    public int getPrix() {
        return prix;
    }

    public String getImatriculation() {
        return imatriculation;
    }

    public void noter() {
        switch (entretien) {
            case PASENTRETENUE -> note -= 0.5;
            case ABIME -> note -= 1.5;
            case EPAVE -> note -= 2.5;
        }
        if (kilometrage > 100000) note -= 0.5;
        else if (kilometrage > 80000) note -= 1;
        else if (kilometrage > 40000) note -= 1.5;

        if (nbMains > 3) note -= 0.5;
    }

    public void estimer() {
        if (entretien != Entretien.NEUVE) {
            if (annee + 1 == Year.now().getValue()) prix /= (int) (1 / 3);
            if (nbMains != 0) prix /= (int) (1 / 6);
            switch ((int) note) {
                case 4 -> prix /= (int) (1 / 6);
                case 3 -> prix /= (int) (2 / 6);
                case 2 -> prix /= (int) (1 / 2);
                case 1, 0 -> prix /= (int) (4 / 6);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return annee == voiture.annee && kilometrage == voiture.kilometrage && nbMains == voiture.nbMains &&
                prix == voiture.prix && Double.compare(voiture.note, note) == 0 && type == voiture.type &&
                marque == voiture.marque && Objects.equals(moteur, voiture.moteur) && Objects.equals(roue, voiture.roue) &&
                entretien == voiture.entretien && Objects.equals(imatriculation, voiture.imatriculation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, marque, moteur, roue, annee, kilometrage, nbMains, prix, note, entretien, imatriculation);
    }

    @Override
    public String toString() {
        return "\nType= " + type +
                "\nMarque= " + marque +
                "\n" + moteur +
                "\n" + roue +
                "\nAnnee= " + annee +
                "\nKilometrage= " + kilometrage +
                "\nNombre de mains= " + nbMains +
                "\nNote= " + note +
                "\nPrix= " + prix +
                "\nEntretien= " + entretien +
                "\nImatriculation= '" + imatriculation + '\'' +
                "}\n";
    }
}
