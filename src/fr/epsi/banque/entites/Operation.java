package fr.epsi.banque.entites;

public abstract class Operation {
    protected String date;
    protected double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation du " + date + " : ";
    }

    public abstract String afficherType();
}
