package ma.dev7hd.figure;

import java.util.Observer;

public interface Figure {
    double perimetre();
    double surface();
    void afficher();
    void update(Parametrage p);
}
