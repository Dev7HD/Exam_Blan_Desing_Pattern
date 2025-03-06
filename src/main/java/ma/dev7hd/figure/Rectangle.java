package ma.dev7hd.figure;

public class Rectangle implements Figure {
    private Point coinSupGauche;
    private double hauteur, largeur;
    private Parametrage parametrage;

    public Rectangle(Point coin, double l, double h, Parametrage p) {
        this.coinSupGauche = coin;
        this.largeur = l;
        this.hauteur = h;
        this.parametrage = p;
        p.addObserver(this); // S'abonner aux mises à jour du paramétrage
    }

    @Override
    public double perimetre() {
        return (hauteur + largeur) * 2;
    }

    @Override
    public double surface() {
        return hauteur * largeur;
    }

    @Override
    public void afficher() {
        System.out.println("Rectangle : Coin = " + coinSupGauche + ", Largeur = " + largeur + ", Hauteur = " + hauteur);
    }

    @Override
    public void update(Parametrage p) {
        // Mettre à jour les attributs du rectangle en fonction du paramétrage
        System.out.println("Rectangle mis à jour avec le paramétrage : " + p);
    }
}
