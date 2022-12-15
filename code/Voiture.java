package code;


import java.time.Year;
import java.util.Objects;


public class Voiture implements Estimable, Notable {
    private final Type type;
    private final Marque marque;
    private final Moteur moteur;
    private Roue roue;

    private final int annee, kilometrage;
    private int prix, nbMains;
    private double note = 5.0;

    private Entretien entretien;
    private final String immatriculation;

    public Voiture(Type type, Marque marque, Moteur moteur, Roue roue, int annee, int kilometrage, String imatriculation, Entretien entretien, int prixNeuve) {
        this.type = type;
        this.marque = marque;
        this.moteur = moteur;
        this.roue = roue;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.immatriculation = imatriculation;
        this.entretien = entretien;
        this.prix = prixNeuve;
        this.nbMains = 0;
        noter();
        estimer();
    }

    public Voiture(Type type, Marque marque, Moteur moteur, Roue roue, int annee, int kilometrage, String imatriculation, Entretien entretien, int prixNeuve, int nbMains) {
        this.type = type;
        this.marque = marque;
        this.moteur = moteur;
        this.roue = roue;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.immatriculation = imatriculation;
        this.entretien = entretien;
        this.prix = prixNeuve;
        this.nbMains = nbMains;
        noter();
        estimer();
    }
    /** Retourne la marque de la voiture */
    public Marque getMarque() {
        return marque;
    }

    /** Retourne le nombre de mains de la voiture */
    public int getNbMains() {
        return nbMains;
    }

    /** Retourne la note de la voiture */
    public double getNote() {
        return note;
    }

    /** Retourne le prix de la voiture */
    public int getPrix() {
        return prix;
    }

    /** Retourne la roue de la voiture */
    public Roue getRoue() {
        return roue;
    }

    /** Retourne l'entretien de la voiture */
    public Entretien getEntretien() {
        return entretien;
    }

    /** Retourne l'immatriculation de la voiture */
    public String getImatriculation() {
        return immatriculation;
    }

    /** Permet la modification de la roue actuelle de la voiture */
    public void setRoue(Roue roue) {
        this.roue = roue;
    }

    /** Permet la modification du prix actuel de la voiture */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /** Permet la modification du nombre de main actuel de la voiture */
    public void setNbMains(int nbMains) {
        this.nbMains = nbMains;
    }

    /** Permet la modification de l'entretien actuel de la voiture */
    public void setEntretien(Entretien entretien) {
        this.entretien = entretien;
    }

    /** Fonction permettant la notation automatique d'une voiture selon 3 caractéristiques : l'entretien , le kilométrage et le nombre de mains*/
    public void noter() {
        switch (entretien) {
            case PASENTRETENUE -> note -= 0.5;
            case ABIMEE -> note -= 1.5;
            case EPAVE -> note -= 2.5;
        }
        if (kilometrage > 100000) note -= 1.5;
        else if (kilometrage > 80000) note -= 1;
        else if (kilometrage > 40000) note -= 0.5;

        if (nbMains > 3) note -= 0.5;
    }

    /** Fonction permettant l'estimation de prix d'une voiture selon les caractéristiques suivantes: l'année de la voiture, son nombre de main et sa note*/
    public void estimer() {
        if (entretien != Entretien.NEUVE) {
            if (annee + 1 == Year.now().getValue()) prix -= prix/3;
            if (nbMains != 0) prix -= prix/6;
            switch ((int) note) {
                case 4 -> prix -= prix/6;
                case 3 -> prix -= 2 * prix/6;
                case 2 -> prix -= prix/2;
                case 1, 0 -> prix -= 4 * prix/6;
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
                entretien == voiture.entretien && Objects.equals(immatriculation, voiture.immatriculation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, marque, moteur, roue, annee, kilometrage, nbMains, prix, note, entretien, immatriculation);
    }

    @Override
    public String toString() {
        return  "\nType= " + type +
                "\nMarque= " + marque +
                "\n" + moteur +
                "\n" + roue +
                "\nAnnee= " + annee +
                "\nKilometrage= " + kilometrage +
                "\nNombre de mains= " + nbMains +
                "\nNote= " + note +
                "\nPrix= " + prix +
                "\nEntretien= " + entretien +
                "\nImatriculation= '" + immatriculation + '\'' +
                "}\n";
    }
}
