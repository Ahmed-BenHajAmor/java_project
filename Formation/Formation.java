package Formation;

public class Formation {
    String titre;
    String description;
    Object formateur;
    double prix;
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Object getFormateur() {
        return formateur;
    }
    public void setFormateur(Object formateur) {
        this.formateur = formateur;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Formation(String titre, String description, Object formateur, double prix) {
        this.titre = titre;
        this.description = description;
        this.formateur = formateur;
        this.prix = prix;
    }
   

}
