package ma.dev7hd;

import ma.dev7hd.figure.*;
import ma.dev7hd.stratigies.TraitementAffichage;
import ma.dev7hd.stratigies.TraitementPerimetreTotal;
import ma.dev7hd.stratigies.TraitementSurfaceTotale;

public class Main {
    public static void main(String[] args) {
        // Création d'un dessin
        Dessin dessin = new Dessin();

        // Ajout de figures
        dessin.ajouterFigure(new Rectangle(new Point(0, 0), 5, 10, Parametrage.getInstance()));
        dessin.ajouterFigure(new Cercle(new Point(2, 2), 3, Parametrage.getInstance()));

        // Application de différentes stratégies
        dessin.setStrategy(new TraitementAffichage());
        dessin.traiter(); // Affiche les figures

        dessin.setStrategy(new TraitementSurfaceTotale());
        dessin.traiter(); // Calcule la surface totale

        dessin.setStrategy(new TraitementPerimetreTotal());
        dessin.traiter(); // Calcule le périmètre total
    }
}