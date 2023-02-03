public class Vaisseau {
    private String nom;
    private int puissanceDeFeu;
    private int nombrePassagers;

    public Vaisseau(String nom, int puissanceDeFeu, int nombrePassagers) {
        this.nom = nom;
        this.puissanceDeFeu = puissanceDeFeu;
        this.nombrePassagers = nombrePassagers;
    }
    public Vaisseau(String nom, int puissanceDeFeu) {
        this(nom, puissanceDeFeu, 0);
    }
    public String getNom() {
        return this.nom;
    }
    public int getPuissance() {
        return this.puissanceDeFeu;
    }
    public boolean transportePassagers() {
        return this.nombrePassagers > 0;
    }
    public int getNombrePassagers() {
        return this.nombrePassagers;
    }
}
