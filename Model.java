public enum Model {
    CENT_SIX{
        Marque getMarque() {
            return Marque.PEUGEOT;
        }

        Roue getRoue() {
            return new Roue(Jante.TREIZE_POUCES, MarquePneu.MICHELIN);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(4, 70, 6.10, Propultion.SP95);
        }
    },
    TROIS_CENT_HUIT{
        Marque getMarque() {
            return Marque.PEUGEOT;
        }

        Roue getRoue() {
            return new Roue(Jante.SEIZE_POUCES, MarquePneu.MICHELIN);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 155, 4.8, Propultion.DIESEL);
        }
    },
    MILLE_SEPT_CENT_CINQUANTE{
        Marque getMarque() {
            return Marque.ALPHAROMEO;
        }

        Roue getRoue() {
            return new Roue(Jante.QUATORZE_POUCES, MarquePneu.PIRELLI);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(10, 115, 11, Propultion.ESSENCE);
        }
    },
    GIULIA{
        Marque getMarque() {
            return Marque.ALPHAROMEO;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.PIRELLI);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(11, 200, 9.2, Propultion.ESSENCE);
        }
    },
    R_HUIT_GT{
        Marque getMarque() {
            return Marque.AUDI;
        }

        Roue getRoue() {
            return new Roue(Jante.VINGT_POUCES, MarquePneu.BRIDGESTONE);
        }

        Type getType(){
            return Type.COUPE;
        }

        Moteur getMoteur() {
            return new Moteur(49, 620, 15, Propultion.ESSENCE);
        }
    },
    A_SIX{
        Marque getMarque() {
            return Marque.AUDI;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_SEPT_POUCES, MarquePneu.CONTINANTAL);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 136, 8.3, Propultion.DIESEL);
        }
    },
    SERIE_UN{
        Marque getMarque() {
            return Marque.BMW;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.CONTINANTAL);
        }

        Type getType(){
            return Type.COUPE;
        }

        Moteur getMoteur() {
            return new Moteur(15, 265, 7, Propultion.ESSENCE);
        }
    },
    X_TROIS{
        Marque getMarque() {
            return Marque.BMW;
        }

        Roue getRoue() {
            return new Roue(Jante.VINGT_POUCES, MarquePneu.CONTINANTAL);
        }

        Type getType(){
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(16, 265, 9.3, Propultion.ESSENCE);
        }
    };

    abstract Moteur getMoteur();

    abstract Type getType();

    abstract Marque getMarque();

    abstract Roue getRoue();
}
