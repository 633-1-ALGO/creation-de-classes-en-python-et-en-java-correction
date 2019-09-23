package domaine;

public class Etudiant extends Personne {

    private int semestre;

    public Etudiant() {
//        super();
        semestre = 1;
    }

    public Etudiant(String nom) {
        this(nom, 1);
    }

    public Etudiant(String nom, int semestre) {
        super(nom);
        this.semestre = semestre;
    }

    @Override
    public String afficher() {
        return getNom() + " est dans le semestre " + semestre;
    }
}
