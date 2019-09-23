from abc import ABC


class Personne (ABC):

    def __init__(self, nom = "Inconnu") -> None:
        self.__nom = nom

    def get_nom(self) -> str:
        return self.__nom

    def set_nom(self, nom: str) -> None :
        self.__nom = nom

    def __eq__(self, o: object) -> bool:
        return self.__nom == o.__nom

    def __hash__(self) -> int:
        return self.__nom.__hash__()

    def afficher(self) -> str:
        return self.__nom
