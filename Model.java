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
    },
    CINQ_CENT_ABARTH{
        Marque getMarque() {
            return Marque.FIAT;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_SEPT_POUCES, MarquePneu.PIRELLI);
        }

        Type getType(){
            return Type.SPORT;
        }

        Moteur getMoteur() {
            return new Moteur(9, 160, 6.6, Propultion.ESSENCE);
        }
    },
    MULTIPLA{
        Marque getMarque() {
            return Marque.FIAT;
        }

        Roue getRoue() {
            return new Roue(Jante.QUINZE_POUCES, MarquePneu.PIRELLI);
        }

        Type getType(){
            return Type.FOURGONNETTE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 120, 1.9, Propultion.DIESEL);
        }
    },
    MUSTANG_SOIXANTE_NEUF{
        Marque getMarque() {
            return Marque.FORD;
        }

        Roue getRoue() {
            return new Roue(Jante.QUINZE_POUCES, MarquePneu.CONTINANTAL);
        }

        Type getType(){
            return Type.SPORT;
        }

        Moteur getMoteur() {
            return new Moteur(27, 330, 17.7, Propultion.ESSENCE);
        }
    },
    EXPLORER{
        Marque getMarque() {
            return Marque.FORD;
        }

        Roue getRoue() {
            return new Roue(Jante.VINGT_POUCES, MarquePneu.CONTINANTAL);
        }

        Type getType(){
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(32, 457, 3.1, Propultion.HYBRIDE);
        }
    },
    PRIMASTAR_COMBI{
        Marque getMarque() {
            return Marque.NISSAN;
        }

        Roue getRoue() {
            return new Roue(Jante.SEIZE_POUCES, MarquePneu.GOODYEAR);
        }

        Type getType(){
            return Type.MINIBUS;
        }

        Moteur getMoteur() {
            return new Moteur(8, 150, 7.2, Propultion.DIESEL);
        }
    },
    JUKE{
        Marque getMarque() {
            return Marque.NISSAN;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_NEUF_POUCES, MarquePneu.GOODYEAR);
        }

        Type getType(){
            return Type.BREAK;
        }

        Moteur getMoteur() {
            return new Moteur(6, 114, 5.8, Propultion.SP95);
        }
    },
    YARIS{
        Marque getMarque() {
            return Marque.TOYOTA;
        }

        Roue getRoue() {
            return new Roue(Jante.SEIZE_POUCES, MarquePneu.GOODYEAR);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(4, 92, 5.7, Propultion.SP95);
        }
    },
    MODEL_S{
        Marque getMarque() {
            return Marque.TESLA;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_NEUF_POUCES, MarquePneu.CONTINANTAL);
        }

        Type getType(){
            return Type.SPORT;
        }

        Moteur getMoteur() {
            return new Moteur(4, 1020, 0, Propultion.ELECTRIQUE);
        }
    },
    MODEL_Y{
        Marque getMarque() {
            return Marque.TESLA;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_NEUF_POUCES, MarquePneu.CONTINANTAL);
        }

        Type getType(){
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(11, 462, 0, Propultion.ELECTRIQUE);
        }
    },
    CLASSE_C{
        Marque getMarque() {
            return Marque.MERCEDES;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.BRIDGESTONE);
        }

        Type getType(){
            return Type.BERLINE;
        }

        Moteur getMoteur() {
            return new Moteur(11, 204, 6.5, Propultion.HYBRIDE);
        }
    },
    CLASSE_G{
        Marque getMarque() {
            return Marque.MERCEDES;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.BRIDGESTONE);
        }

        Type getType(){
            return Type.SUV;
        }

        Moteur getMoteur() {
            return new Moteur(17, 245, 9.9, Propultion.DIESEL);
        }
    },
    KANGOO{
        Marque getMarque() {
            return Marque.RENAULT;
        }

        Roue getRoue() {
            return new Roue(Jante.QUINZE_POUCES, MarquePneu.MICHELIN);
        }

        Type getType(){
            return Type.FOURGONNETTE;
        }

        Moteur getMoteur() {
            return new Moteur(7, 114, 6.2, Propultion.ESSENCE);
        }
    },
    ARKANA{
        Marque getMarque() {
            return Marque.RENAULT;
        }

        Roue getRoue() {
            return new Roue(Jante.DIX_HUIT_POUCES, MarquePneu.MICHELIN);
        }

        Type getType(){
            return Type.CROSSOVER;
        }

        Moteur getMoteur() {
            return new Moteur(7, 140, 4.9, Propultion.ESSENCE);
        }
    };



    abstract Moteur getMoteur();

    abstract Type getType();

    abstract Marque getMarque();

    abstract Roue getRoue();
}
