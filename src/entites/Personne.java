package entites;
public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse;

//Constructeurs(mode noob engagé ^^)
    public Personne(){
        this("", "", new AdressePostale());
    }
    public Personne(String nom){
        this(nom, "", new AdressePostale());
    }
    public Personne(String nom, String prenom){
        this(nom, prenom, new AdressePostale());
    }
    public Personne(String nom,String prenom,AdressePostale adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
//Getters & Setters(mode noob engagé ^^)
    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public AdressePostale getAdresse() {
        return adresse;
    }
//Méthodes de classe(mode noob engagé ^^)
    public String formatNom(){
        return this.prenom + " " + this.nom.toUpperCase();
    }
}