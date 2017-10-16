public class EtudiantExterne extends Etudiant {

    public EtudiantExterne(int num, String nom, String prenom, int annee, String filiere, CiteUniversitaire citeUniversitaire) {
        super(num, nom, prenom, annee, filiere);
        super.setAdresse(citeUniversitaire.getAdresse());
        citeUniversitaire.addEtudiant(this);
    }


    @Override
    public String toString() {

        return "EtudiantExterne{" +
                "numInscription=" + super.getNumInscription() +
                ", nom='" + super.getNom() + '\'' +
                ", prenom='" + super.getPrenom() + '\'' +
                ", cite='" + super.getAdresse() + '\'' +
                ", annee=" + super.getAnnee() +
                ", filiere='" + super.getFiliere() + '\'' +
                '}';
    }


}
