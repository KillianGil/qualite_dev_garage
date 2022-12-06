package code;

import java.util.Objects;

public class Roue {
    private final Jante jante;
    private final MarquePneu marquePneu;

    public Roue(Jante jantes, MarquePneu marquePneu) {
        this.jante = jantes;
        this.marquePneu = marquePneu;
    }

    public Jante getJantes() {
        return jante;
    }

    public MarquePneu getMarquePneu() {
        return marquePneu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roue roue = (Roue) o;
        return jante == roue.jante && marquePneu == roue.marquePneu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jante, marquePneu);
    }

    @Override
    public String toString() {
        return "Roue= {" +
                "Jante= " + jante +
                ", Marque Pneu= " + marquePneu +
                '}';
    }

    public static class Affichage {
        public static void openTerminal() {

            try {
                String[] cmdArray = {"gnome-terminal"};
                Process p = Runtime.getRuntime().exec(cmdArray);
                System.out.println("cest bon");
            } catch (Exception e) {
                System.out.println("Failed to open terminal: " + e.getMessage());
            }

        }
    }
}
