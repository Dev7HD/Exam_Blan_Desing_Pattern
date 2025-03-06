package ma.dev7hd.figure;

import java.util.ArrayList;
import java.util.List;

public class Groupe implements Figure {
    private List<Figure> figures = new ArrayList<>();

    public void ajouterFigure(Figure figure) {
        figures.add(figure);
    }

    public void supprimerFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public double perimetre() {
        double total = 0;
        for (Figure f : figures) {
            total += f.perimetre();
        }
        return total;
    }

    @Override
    public double surface() {
        double total = 0;
        for (Figure f : figures) {
            total += f.surface();
        }
        return total;
    }

    @Override
    public void afficher() {
        System.out.println("Groupe de figures :");
        for (Figure f : figures) {
            f.afficher();
        }
    }

    @Override
    public void update(Parametrage p) {
        for (Figure f : figures) {
            f.update(p); // Mettre à jour chaque figure du groupe
        }
    }
}
