package ma.dev7hd.stratigies;

import ma.dev7hd.figure.Dessin;
import ma.dev7hd.figure.Figure;
import ma.dev7hd.figure.TraitementStrategy;

/**
 * Algorithme de traitement : calcule la surface totale de toutes les figures du dessin.
 */
public class TraitementSurfaceTotale implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
        double surfaceTotale = 0;
        for (Figure figure : dessin.getFigures()) {
            surfaceTotale += figure.surface(); // Ajoute la surface de chaque figure
        }
        System.out.println("Surface totale du dessin : " + surfaceTotale);
    }
}
