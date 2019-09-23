import Metier.Ecole;
import Metier.Etudiant;
import Metier.Personne;
import Metier.Professeur;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // On ne peut pas le faire
        //Personne p = new Personne(){};

        Professeur prof = new Professeur("Douglas", 3800);
        print(prof);

        Etudiant etudiant = new Etudiant();
        print(etudiant);

        etudiant = new Etudiant("Flavio");
        print(etudiant);

        etudiant = new Etudiant("Flavio", 6);
        print(etudiant);

        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add(etudiant);
        Ecole ecole = new Ecole(personnes);

        // Par défaut, on affiche les références d'un objet
        System.out.println(ecole);
    }

    public static void print(Personne p) {
        System.out.println(p.afficher());
    }
}
