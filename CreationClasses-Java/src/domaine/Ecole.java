package domaine;

import java.util.ArrayList;

public class Ecole {

    private ArrayList<Personne> personnes;

    public Ecole (ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }

    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }
}
