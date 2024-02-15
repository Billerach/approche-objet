package fr.epsi.banque.entites;

public class CompteTaux extends Compte{
    double taux;

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public CompteTaux(int numeroCompte, int soldeCompte, double taux) {
        super(numeroCompte, soldeCompte);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " épargne à " + taux*100 + " %";
    }
}
