import java.util.ArrayList;

public class CiteUniversitaire {

    private String nomCite;
    private String adresse;
    private int capacite;
    private int nombreEtudiant;
    private ArrayList<EtudiantExterne> listEtudiant = new ArrayList<>();


    public CiteUniversitaire(String nomCite, String adresse, int capacite) {
        this.nomCite = nomCite;
        this.adresse = adresse;
        this.capacite = capacite;
        this.nombreEtudiant = 0;
    }


    public void addEtudiant(EtudiantExterne etudiantExterne) {
        listEtudiant.add(etudiantExterne);
        nombreEtudiant++;
    }

    public void afficherListEtudiant() {
        for (int i = 0; i < listEtudiant.size(); i++) {
            System.out.println(i + 1 + "- " + listEtudiant.get(i));
        }
    }


    public String getNomCite() {
        return nomCite;
    }

    public void setNomCite(String nomCite) {
        this.nomCite = nomCite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getNombreEtudiant() {
        return nombreEtudiant;
    }

    public void setNombreEtudiant(int nombreEtudiant) {
        this.nombreEtudiant = nombreEtudiant;
    }

    public ArrayList<EtudiantExterne> getListEtudiant() {
        return listEtudiant;
    }

    public void setListEtudiant(ArrayList<EtudiantExterne> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }
}
