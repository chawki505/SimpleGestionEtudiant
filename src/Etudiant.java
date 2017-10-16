public class Etudiant {

    private int numInscription;
    private String nom;
    private String prenom;
    private String adresse;
    private int annee;
    private String filiere;


    public Etudiant(int num, String nom, String prenom, String adresse, int annee, String filiere) {
        this.numInscription = num;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.annee = annee;
        this.filiere = filiere;
    }

    //pour etudiant externe
    public Etudiant(int numInscription, String nom, String prenom, int annee, String filiere) {
        this.numInscription = numInscription;
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
        this.filiere = filiere;
    }

    public int getNumInscription() {
        return numInscription;
    }

    public void setNumInscription(int numInscription) {
        this.numInscription = numInscription;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }


    @Override
    public String toString() {
        return "Etudiant {" +
                " numInscription=" + numInscription +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", annee=" + annee +
                ", filiere='" + filiere + '\'' +
                '}';
    }
}


