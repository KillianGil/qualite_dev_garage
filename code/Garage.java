package code;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Garage {
    private ArrayList<Voiture> catalogue;
    private final ArrayList<Voiture> filtre = new ArrayList<>();

    public Garage() {
    }

    public Garage(ArrayList<Voiture> catalogue) {
        this.catalogue = catalogue;
    }

    public void setCatalogue(ArrayList<Voiture> catalogue) {
        this.catalogue = catalogue;
    }

    public ArrayList<Voiture> getCatalogue() {
        return catalogue;
    }

    public void addVoiture(Voiture voiture) {
        this.catalogue.add(voiture);
    }

    public void removeVoiture(Voiture voiture){this.catalogue.remove(voiture);}

    public Voiture getVoitureByImat(String imat){
        for (Voiture voiture : this.catalogue) {
            if (Objects.equals(voiture.getImatriculation(), imat)) {
                return voiture;
            }
        }
        return null;
    }

    public Voiture chooseVoitureByImat(Scanner sc){
        Voiture voiture;
        while(true) {
            System.out.println("Entrer l'imatriculation de la voiture souhaite ");
            voiture = getVoitureByImat(sc.next().toUpperCase());
            if (voiture != null) break;
            else System.out.println("Voiture non disponible");
        }
        return voiture;
    }

    public ArrayList<Voiture> filtreMarque(Marque marque) {
        filtre.clear();
        for (Voiture voiture : catalogue) {
            if (voiture.getMarque().equals(marque)) filtre.add(voiture);
        }
        return filtre;
    }

    public ArrayList<Voiture> filtrePrix() {
        filtre.clear();
        filtre.add(catalogue.get(0));
        for (int i = 0; i < catalogue.size(); ++i) {
            int index = i;
            for (int j = i + 1; j < catalogue.size(); ++j) {
                if (catalogue.get(j).getPrix() >= filtre.get(index).getPrix()) {
                    filtre.add(0, catalogue.get(j));
                    index = j;
                } else filtre.add(catalogue.get(j));
            }
        }
        return filtre;
    }

    public ArrayList<Voiture> filtreNote() {
        filtre.clear();
        filtre.add(catalogue.get(0));
        for (int i = 0; i < catalogue.size(); ++i) {
            int index = i;
            for (int j = i + 1; j < catalogue.size(); ++j) {
                if (catalogue.get(j).getNote() >= filtre.get(index).getNote()) {
                    filtre.add(0, catalogue.get(j));
                    index = j;
                } else filtre.add(catalogue.get(j));
            }
        }
        return filtre;
    }

    public ArrayList<Voiture> filtreNbMain(int nbMain) {
        filtre.clear();
        for (Voiture voiture : catalogue) {
            if (voiture.getNbMains() == nbMain) filtre.add(voiture);
        }
        return filtre;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "\ncatalogue= " + catalogue +
                '}';
    }
}
