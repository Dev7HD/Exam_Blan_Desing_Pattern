package ma.dev7hd.figure;

/**
 * Interface définissant un contrat pour les algorithmes de traitement.
 */
public interface TraitementStrategy {
    /**
     * Traite un dessin.
     * @param dessin Le dessin à traiter.
     */
    void traiter(Dessin dessin);
}