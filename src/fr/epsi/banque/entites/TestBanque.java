package fr.epsi.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(123, 1000);
        System.out.printf("Le solde du compte est de %.02f euros.", compte.getSoldeCompte());
    }
}
