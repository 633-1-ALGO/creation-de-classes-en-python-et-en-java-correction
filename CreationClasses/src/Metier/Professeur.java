package Metier;

import java.util.Objects;

public class Professeur extends Personne {

    private double salaire;

    public Professeur(String nom, double salaire) {
        super(nom);
        this.salaire = salaire;

    }

    @Override
    public String afficher() {
        return getNom();
    }

    @Override
    public boolean equals(Object o) {
        Professeur other = (Professeur)o;
        return other.salaire == salaire && other.getNom() == getNom();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom()) * Objects.hash(salaire);
    }
}
