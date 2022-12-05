package code;


import java.time.Year;


public class Voiture {
    private final Type type;
    private final Marque marque;
    private final Moteur moteur;
    private final Roue roue;

    private final int annee, kilometrage, nbMains;
    private double note, prix;

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
        this.nbMains = 0;
        setNote();
        setPrix();
    }

    public void setNote(){
        switch (entretien){
            case NEUVE -> note = 5;
            case PASENTRETENUE ->  note -= 0.5;
            case ABIME -> note -= 1.5;
            case EPAVE -> note -= 2.5;
        }
        if (kilometrage > 100000) note -= 0.5;
        else if (kilometrage > 80000) note -= 1;
        else if (kilometrage > 40000) note -=1.5;

        if (nbMains > 3) note -= 0.5;
    }

    public void setPrix(){
        if(entretien != Entretien.NEUVE){
            if(annee + 1 == Year.now().getValue()) prix /= 1.0 /3;
            if(nbMains != 0) prix /= 1.0 /6;
            switch ((int) note){
                case 4 -> prix /= 1.0 /6;
                case 3 -> prix /= 2.0 /6;
                case 2 -> prix /= 3.0 /6;
                case 1, 0 -> prix /= 4.0 /6;
            }
        }
    }

    @Override
    public String toString() {
        return "java.Voiture{" +
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