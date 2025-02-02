package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class Action extends Carte{
    public Action(String nom, int cout, int valeur, String action){
        super(nom, "Action", "Rouge", cout, valeur);
    }

    public Action(String nom, int cout, int valeur){
        super(nom, "Action", "Rouge", cout, valeur);
    }
    @Override
    public void jouer(Joueur joueur, boolean cabineConduc){
        jouer(joueur);
        joueur.ajouterArgent(-getvaleur());
    }
}