package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {

//Dans cette classe instanciez une ArrayList d’entiers et placez y les éléments suivants : -1, 5, 7, 3, -2, 4, 8, 5
        List<Integer> entiers = new ArrayList<>();
        int[] array = {-1, 5, 7, 3, -2, 48, 566, 5};
        for (int n : array) {
            entiers.add(n);
        }
//Affichez tous les éléments de la liste
        System.out.println(entiers);
//Affichez la taille de la liste
        System.out.println(entiers.size());
//Recherchez et affichez le plus grand élément de la liste
        System.out.println(Collections.max(entiers));
//Supprimez le plus petit élément de la liste et affichez le résultat
        entiers.remove(Collections.min(entiers));
        System.out.println(entiers);
//Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs.
        for (int i = 0; i < entiers.size(); i++)
//            if (entiers.get(i) < 0) {
//                entiers.set(i, -entiers.get(i));
//          
//Affichez enfin la liste résultante
        System.out.println(entiers.size());
    }
}