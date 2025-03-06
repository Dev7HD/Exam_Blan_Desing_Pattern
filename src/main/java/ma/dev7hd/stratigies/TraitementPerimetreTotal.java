package ma.dev7hd.stratigies;

import ma.dev7hd.figure.Dessin;
import ma.dev7hd.figure.Figure;
import ma.dev7hd.figure.TraitementStrategy;

/**
 * Algorithme de traitement : calcule le périmètre total de toutes les figures du dessin.
 */
public class TraitementPerimetreTotal implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
        double perimetreTotal = 0;
        for (Figure figure : dessin.getFigures()) {
            perimetreTotal += figure.perimetre(); // Ajoute le périmètre de chaque figure
        }
        System.out.println("Périmètre total du dessin : " + perimetreTotal);
    }
}
