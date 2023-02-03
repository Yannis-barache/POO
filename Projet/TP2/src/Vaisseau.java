public class Vaisseau {
    private String nom; /** Le nom du vaisseau */
    private int puissanceDeFeu; /** La puissance de feu du vaisseau */
    private int nombrePassagers; /** Le nombre de passagers que peut emmener le vaisseau */

    /** Créer un vaisseau grâce à son nom sa puissance de feu et son nombre de passagers
     * @param  nom Un String qui est le nom du vaisseau
     * @param  puissanceDeFeu Un int qui est le nombre de passagers du vaisseau
     * @param  nombrePassagers Un int qui est son nombre de passagers*/
    public Vaisseau(String nom, int puissanceDeFeu, int nombrePassagers) {
        this.nom = nom;
        this.puissanceDeFeu = puissanceDeFeu;
        this.nombrePassagers = nombrePassagers;
    }

    /** Créer un vaisseau à partir  d'un nom et de sa puissance de feu
     * @param nom Un String qui est le nom du vaisseau
     * @param puissanceDeFeu Un int qui est la puissance de feu du vaisseau*/
    public Vaisseau(String nom, int puissanceDeFeu) {

        this(nom, puissanceDeFeu, 0);
    }

    /** Retourne le nom du vaisseau
     * @return Un String qui est le nom du vaisseau*/
    public String getNom() {

        return this.nom;
    }

    /** Retourne la puissance du vaisseau
     * @return Un int qui est la puissance de feu du vaisseau*/
    public int getPuissance() {

        return this.puissanceDeFeu;
    }

    /** Retourne un booléen correspondant à si un vaisseau transporte ou non des passagers
     * @return true si le vaisseau a des passagers false sinon */
    public boolean transportePassagers() {

        return this.nombrePassagers > 0;
    }

    /** Retourne le nombre de passagers dans le vaisseau
     * @return int qui est le nombre de passagers*/
    public int getNombrePassagers() {

        return this.nombrePassagers;
    }
}
