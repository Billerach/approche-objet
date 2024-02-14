package essais;
import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {

        Personne spike = new Personne("Spiegel","Spike");
        spike.setAdresse(new AdressePostale(
                5,
                "allée",
                "Yuri Gagarin",
                44100,
                "Nantes"
        ));
        AdressePostale adresseBrute = spike.getAdresse();
        String adresse = adresseBrute.FormatAddress(adresseBrute);
        System.out.println(adresse);
    }
}