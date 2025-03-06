package ma.dev7hd.figure;

public class Cercle implements Figure {
    private Point centre;
    private double rayon;
    private Parametrage parametrage;

    public Cercle(Point centre, double rayon, Parametrage p) {
        this.centre = centre;
        this.rayon = rayon;
        this.parametrage = p;
        p.addObserver(this); // S'abonner aux mises à jour du paramétrage
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void afficher() {
        System.out.println("Cercle : Centre = " + centre + ", Rayon = " + rayon);
    }

    @Override
    public void update(Parametrage p) {
        // Mettre à jour les attributs du cercle en fonction du paramétrage
        System.out.println("Cercle mis à jour avec le paramétrage : " + p);
    }
}