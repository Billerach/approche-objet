package essais;
import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale(
                5,
                "boulevard",
                "des Maréchaux",
                44100,
                "Nantes"
        );
        AdressePostale adresse2 = new AdressePostale(
                85,
                "rue",
                "d’Antrain",
                35700,
                "Rennes"
        );
    }
}

