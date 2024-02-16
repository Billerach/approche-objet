package fr.epsi.geometrie.essais;

import fr.epsi.geometrie.entites.Cercle;
import fr.epsi.geometrie.entites.ObjetGeometrique;
import fr.epsi.geometrie.entites.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique a = new Cercle(5);
        ObjetGeometrique b = new Rectangle(7, 5);
        ObjetGeometrique[] array = {a, b};
        for (ObjetGeometrique f : array) {
            System.out.println(
                    "Périmètre de " + Math.round(f.perimetre()) + "cm et surface de " + Math.round(f.surface()) + "cm²"
            );
        }
    }
}