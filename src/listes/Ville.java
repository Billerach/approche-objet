package listes;

public class Ville {
    String nom;
    int nbHabitants;

    public int getNbHabitants() {
        return nbHabitants;
    }

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }
}
