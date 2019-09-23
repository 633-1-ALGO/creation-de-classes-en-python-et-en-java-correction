package domaine;

import java.util.Objects;

public abstract class Personne {

    private String nom;

    public Personne() {
        nom = "Inconnu";
    }

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        Personne other = (Personne)o;
        return other.nom.equals(nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

    // On devrait utiliser toString, mais j'ai utilisé "afficher" pour l'exemple
    public abstract String afficher();
}
