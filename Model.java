public enum Model {
    CENT_SIX{
        Marque getMarque() {
            return Marque.PEUGEOT;
        }

        Roue getRoue() {
            return new Roue(Jante.TREIZE_POUCE, MarquePneu.MICHELIN);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(4, 70, 6.10, Propultion.SP95);
        }
    };

    abstract Moteur getMoteur();

    abstract Type getType();

    abstract Marque getMarque();

    abstract Roue getRoue();
}
