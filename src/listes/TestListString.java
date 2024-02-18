package listes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestListString {
    public static void main(String[] args) {
        String[] villeArray = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
        List<String> villes = new ArrayList<>(Arrays.asList(villeArray));
        List<String> villesTriees = new ArrayList<>(villes);
        villesTriees.sort(Comparator.comparingInt(String::length));
        System.out.println("Ville qui a le plus grand nombre de lettres : " + villesTriees.getLast());

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());

        }
        for (int j = 0; j < villes.size(); j++) {
            if (villes.get(j).startsWith("N")) {
                villes.remove(j);
            }
        }
        System.out.println(villes);
    }
}
