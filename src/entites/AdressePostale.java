package entites;

public class AdressePostale {
    int numeroRue;
    String libelleVoie;
    String typeVoie;
    int codePostal;
    String ville;

    public AdressePostale(){
        this(-1, "voie","inconnue", 0, "");
    };
    public AdressePostale(int numeroRue, String typeVoie, String libelleVoie, int codePostal, String ville){
        this.numeroRue = numeroRue;
        this.typeVoie = typeVoie;
        this.libelleVoie = libelleVoie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String FormatAddress(AdressePostale rawAddress){
        return this.numeroRue + ", " + this.typeVoie + " " + this.libelleVoie + "\n" + this.codePostal + "\n" + this.ville;
    }
}
