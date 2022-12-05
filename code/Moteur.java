package code;

import java.util.Objects;

public class Moteur {
    private int puissanceFiscal, cheveaux;
    private double consomation;
    private Propultion propultion;

    public Moteur(int puissanceFiscal, int cheveaux, double consomation, Propultion propultion) {
        this.puissanceFiscal = puissanceFiscal;
        this.cheveaux = cheveaux;
        this.consomation = consomation;
        this.propultion = propultion;
    }

    public int getPuissanceFiscal() {
        return puissanceFiscal;
    }

    public void setPuissanceFiscal(int puissanceFiscal) {
        this.puissanceFiscal = puissanceFiscal;
    }

    public int getCheveaux() {
        return cheveaux;
    }

    public void setCheveaux(int cheveaux) {
        this.cheveaux = cheveaux;
    }

    public double getConsomation() {
        return consomation;
    }

    public void setConsomation(double consomation) {
        this.consomation = consomation;
    }

    public Propultion getPropultion() {
        return propultion;
    }

    public void setPropultion(Propultion propultion) {
        this.propultion = propultion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moteur moteur = (Moteur) o;
        return puissanceFiscal == moteur.puissanceFiscal && cheveaux == moteur.cheveaux && Double.compare(moteur.consomation, consomation) == 0 && propultion == moteur.propultion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(puissanceFiscal, cheveaux, consomation, propultion);
    }

    @Override
    public String toString() {
        return "java.Moteur{" +
                "puissanceFiscal=" + puissanceFiscal +
                ", cheveaux=" + cheveaux +
                ", consomation=" + consomation +
                ", propultion=" + propultion +
                '}';
    }
}
