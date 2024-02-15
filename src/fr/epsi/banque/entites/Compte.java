package fr.epsi.banque.entites;

public class Compte {
    int numerocompte;
    int soldeCompte;

    public int getNumeroCompte() {
        return numerocompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numerocompte = numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public Compte(int numeroCompte, int soldeCompte) {
        this.numerocompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }
    @Override
    public String toString() {
        return "N°" + numerocompte + " = " + soldeCompte + " € (Compte";
    }
}