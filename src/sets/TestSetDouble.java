package sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {

//Dans cette classe instanciez un HashSet de doubles et placez y les éléments suivants :
//1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
        double[] tab = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
        Set<Double> numbers = new HashSet<>();
        for (double number : tab) {
            numbers.add(number);
        }
//Affichez tous les éléments de la collection
        System.out.println(numbers);
//Recherchez le plus grand élément de la collection
        System.out.println(Collections.max(numbers));
//Supprimez le plus petit élément de la collection
        numbers.remove(Collections.min(numbers));
//Affichez enfin le contenu de la collection ainsi modifiée
        System.out.println(numbers);
    }
}
