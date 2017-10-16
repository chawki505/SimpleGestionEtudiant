public class Main {


    public static void main(String[] args) {

        CiteUniversitaire citeUniversitaire1 = new CiteUniversitaire("nomCite1", "adresseCite1", 100);
        CiteUniversitaire citeUniversitaire2 = new CiteUniversitaire("nomCite2", "adresseCite2", 200);


        EtudiantExterne etudiant1 = new EtudiantExterne(1, "chawki", "chouib", 2018, "informatique", citeUniversitaire1);
        EtudiantExterne etudiant2 = new EtudiantExterne(1, "chawki", "chouib", 2018, "informatique", citeUniversitaire1);
        EtudiantExterne etudiant3 = new EtudiantExterne(1, "chawki", "chouib", 2018, "informatique", citeUniversitaire1);
        EtudiantExterne etudiant4 = new EtudiantExterne(1, "chawki", "chouib", 2018, "informatique", citeUniversitaire2);
        EtudiantExterne etudiant5 = new EtudiantExterne(1, "chawki", "chouib", 2018, "informatique", citeUniversitaire1);
        EtudiantExterne etudiant6 = new EtudiantExterne(1, "chawki", "chouib", 2018, "informatique", citeUniversitaire2);


        //affiche l'ensemble des etudiant d'une cite
        citeUniversitaire1.afficherListEtudiant();


        //affiche les info d'un etudiant
        System.out.println(etudiant1);


    }

}
