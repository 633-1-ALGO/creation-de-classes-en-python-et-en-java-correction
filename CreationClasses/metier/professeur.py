from metier.personne import Personne

class Professeur (Personne):

    def __init__(self, nom: str, salaire: int) -> None:
        super().__init__(nom)
        self.__salaire = salaire

    def afficher(self) -> str:
        return self.get_nom()

    def __eq__(self, o: object) -> bool:
        return self.__salaire == o.__salaire and self.get_nom() == o.get_nom()

    def __hash__(self) -> int:
        return self.get_nom().__hash__() * self.__salaire.__hash__()




