package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {

//Dans cette classe instanciez une ArrayList d’entiers et placez y les éléments suivants : -1, 5, 7, 3, -2, 4, 8, 5
        List<Integer> entiers = new ArrayList<>();
        int[] array = {-1, 5, 7, 3, -2, 4, 10, 5};
        for (int n : array) {
            entiers.add(n);
        }
        System.out.println("Liste : " + entiers);

        System.out.println("Taille de la liste : " + entiers.size());

        System.out.println("Le plus grand élément de la liste : " + Collections.max(entiers));

        entiers.remove(Collections.min(entiers));
        System.out.println("Après suppression du plus petit élément : " + entiers);

        for (int i = 0; i < entiers.size(); i++){
            if (entiers.get(i) < 0) {
                entiers.set(i, -entiers.get(i));
            }
        }
        System.out.println("Après avoir rendu les nombres négatifs positif : " + entiers);

    }
}