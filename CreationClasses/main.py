from metier.ecole import Ecole
from metier.professeur import Professeur
from metier.etudiant import Etudiant
from metier.personne import Personne

#personne = Personne()

prof = Professeur("Douglas", 3800)
print(prof.afficher())

etudiant = Etudiant()
print(etudiant.afficher());

etudiant = Etudiant("Flavio");
print(etudiant.afficher());

etudiant = Etudiant("Flavio", 6);
print(etudiant.afficher());

personnes = []
personnes.append(etudiant);
ecole = Ecole(personnes);
