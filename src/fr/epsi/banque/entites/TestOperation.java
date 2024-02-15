package fr.epsi.banque.entites;

public class TestOperation {
    public static void main(String[] args) {

        double solde = 0;

        Operation releveDeCompte[] = {
            new Debit("01/01/2021", 100),
            new Credit("02/02/2022", 200),
            new Debit("03/03/2023", 300),
            new Credit("04/04/2024", 400)
        };

        for (Operation op : releveDeCompte) {
            System.out.println(op + op.afficherType());
        }

        for (Operation op : releveDeCompte) {
            if (op instanceof Credit) {
                solde += op.montant;
            } else {
                solde -= op.montant;
            }
        }
        System.out.println("Le solde est de " + solde + " €.");
    }
}
