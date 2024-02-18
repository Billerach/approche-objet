package listes;

import java.util.*;

public class TestListVille {
    public static void main(String[] args) {
        Ville[] villeArray = {
            new Ville("Nice", 343000),
            new Ville("Carcassonne", 47800),
            new Ville("Narbonne", 53400),
            new Ville("Lyon", 484000),
            new Ville("Foix", 9700),
            new Ville("Pau", 77200),
            new Ville("Marseille", 850700),
            new Ville("Tarbes", 40600)
        };

        List<Ville> villes = new ArrayList<>(Arrays.asList(villeArray));
        Ville villeLaPlusPeuplee = Collections.max(villes, Comparator.comparing(Ville::getNbHabitants));
        System.out.println("Ville la plus peuplée : " + villeLaPlusPeuplee.nom);

        Ville villeLaMoinsPeuplee = Collections.min(villes, Comparator.comparing(Ville::getNbHabitants));
        villes.remove(villeLaMoinsPeuplee);
        System.out.println("Après suppression de la ville la moins peuplée :");
        for (Ville ville : villes) {
            System.out.print(ville.nom + " ");
        }
    }
}