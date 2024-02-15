package fr.epsi.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte cc = new Compte(423642364, 1763);
        CompteTaux ce = new CompteTaux(434240800, 86757, 0.025);
        Compte comptes[] = {cc, ce};
        for (Compte compte : comptes) {
            System.out.println(compte + ").");
        }
    }
}
