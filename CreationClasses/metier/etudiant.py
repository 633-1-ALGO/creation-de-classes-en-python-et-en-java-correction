from metier.personne import Personne

class Etudiant (Personne):

    def __init__(self, nom: str ="Inconnu", semestre: float = 1) -> None:
        super().__init__(nom)
        self.__semestre = semestre

    def afficher(self) -> str:
        return self.get_nom() + " est dans le semestre " + str(self.__semestre)


