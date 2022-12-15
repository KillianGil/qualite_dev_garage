package code;

import java.util.Objects;

public class Moteur {
    private final int puissanceFiscal, cheveaux;
    private final double consomation;
    private final Propultion propultion;

    public Moteur(int puissanceFiscal, int cheveaux, double consomation, Propultion propultion) {
        this.puissanceFiscal = puissanceFiscal;
        this.cheveaux = cheveaux;
        this.consomation = consomation;
        this.propultion = propultion;
    }
    /** Retourne la puissance Fiscale */
    public int getPuissanceFiscal() {
        return puissanceFiscal;
    }
    /** Retourne le nombre de chevaux */
    public int getCheveaux() {
        return cheveaux;
    }
    /** Retourne la consommation de la voiture */
    public double getConsomation() {
        return consomation;
    }
    /** Retourne la propultion de la voiture */
    public Propultion getPropultion() {
        return propultion;
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
        return "Moteur= {" +
                "PuissanceFiscal= " + puissanceFiscal +
                ", Cheveaux= " + cheveaux +
                ", Consomation= " + consomation +
                ", Propultion= " + propultion +
                '}';
    }
}
