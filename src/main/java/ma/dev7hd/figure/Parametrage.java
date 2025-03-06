package ma.dev7hd.figure;

import java.util.ArrayList;
import java.util.List;

public class Parametrage {
    private static Parametrage instance;
    private List<Figure> observers = new ArrayList<>();

    private int epaisseurContour = 1;
    private String couleurContour = "Noir";
    private String couleurRemplissage = "Blanc";

    private Parametrage() {}

    public static Parametrage getInstance() {
        if (instance == null) {
            instance = new Parametrage();
        }
        return instance;
    }

    public void addObserver(Figure figure) {
        observers.add(figure);
    }

    public void removeObserver(Figure figure) {
        observers.remove(figure);
    }

    public void notifyObservers() {
        for (Figure figure : observers) {
            figure.update(this);
        }
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        notifyObservers();
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
        notifyObservers();
    }

    public int getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
        notifyObservers();
    }
}
