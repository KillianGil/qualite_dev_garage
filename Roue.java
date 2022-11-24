public class Roue {
    private Jante jante;
    private MarquePneu marquePneu;

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

}
