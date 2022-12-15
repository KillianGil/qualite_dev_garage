package code;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Garage {
    private ArrayList<Voiture> catalogue = new ArrayList<>();
    private final ArrayList<Voiture> filtre = new ArrayList<>();

    public Garage() {
    }

    public Garage(ArrayList<Voiture> catalogue) {
        this.catalogue = catalogue;
    }

    /** Retourne la liste de voiture du catalogue */
    public ArrayList<Voiture> getCatalogue() {
        return catalogue;
    }
    /** Ajout d'une voiture dans le catalogue */
    public void addVoiture(Voiture voiture) {
        this.catalogue.add(voiture);
    }
    /** Suppression d'une voiture dans le catalogue */
    public void removeVoiture(Voiture voiture){this.catalogue.remove(voiture);}

    /**
     * Fonction permettant de trouver une voiture grâce à son immatriculation
     * @param imat Immatriculation de la voiture choisie
     */
    public Voiture getVoitureByImat(String imat){
        for (Voiture voiture : this.catalogue) {
            if (Objects.equals(voiture.getImatriculation(), imat)) {
                return voiture;
            }
        }
        return null;
    }

    /**
     * Fonction permettant à l'utilisateur de selectionner une voiture par immatriculation
     * @param sc Entrée clavier de l'immatriculation par l'utilisateur
     * @return Retourne la voiture choisie par immatriculation
     */
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

    /**
     * Fonction permettant à l'utilisateur de filter tout le catalogue par marque
     * @param marque Correspond à la marque choisie pour le filtrage dans le catalogue de voiture
     * @return Retourne la liste de voiture disponible de cette marque ci
     */
    public ArrayList<Voiture> filtreMarque(Marque marque) {
        filtre.clear();
        for (Voiture voiture : catalogue) {
            if (voiture.getMarque().equals(marque)) filtre.add(voiture);
        }
        return filtre;
    }

    /**
     * Fonction permettant à l'utilisateur de filter tout le catalogue par prix
     * @return Retourne la liste de voiture disponible par prix
     */
    public ArrayList<Voiture> filtrePrix() {
        filtre.clear();
        filtre.add(catalogue.get(0));
        for (int i = 0; i < catalogue.size(); ++i) {
            for (int j = i + 1; j < catalogue.size(); ++j) {
                if (catalogue.get(j).getPrix() >= filtre.get(i).getPrix()) {
                    filtre.add(i, catalogue.get(j));
                    i = j;
                } else filtre.add(catalogue.get(j));
            }
        }
        return filtre;
    }
    /**
     * Fonction permettant à l'utilisateur de filter tout le catalogue par note
     * @return Retourne la liste de voiture disponible par note ( ordre décroissant )
     */
    public ArrayList<Voiture> filtreNote() {
        filtre.clear();
        filtre.add(catalogue.get(0));
        for (int i = 0; i < catalogue.size(); ++i) {
            for (int j = i + 1; j < catalogue.size(); ++j) {
                if (catalogue.get(j).getNote() >= filtre.get(i).getNote()) {
                    filtre.add(0, catalogue.get(j));
                    i = j;
                } else filtre.add(catalogue.get(j));
            }
        }
        return filtre;
    }
    /**
     * Fonction permettant à l'utilisateur de filter tout le catalogue en fonction du nombre de mains
     * @return Retourne la liste de voiture disponible par nombre de mains
     */
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
