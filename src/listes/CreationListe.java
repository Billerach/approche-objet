package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
        List<Integer> tab = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            tab.add(i);
        }
        System.out.println(tab.size());
        }
    }

