
import java.util.List;
import java.util.ArrayList;

public class Flotte {
    private String nom;
    private List<Vaisseau> vaisseaux;


    /** Crée une flotte avec nom et sans vaisseaux au préalable
     *  @param nom Un String qui représente le nom */
    public Flotte(String nom) {
        this.nom = nom;
        this.vaisseaux = new ArrayList<>();
    }

    /** Crée une flotte sans nom et sans vaisseaux au préalable  */
    public Flotte() {
        this.nom="Nouvelle Flotte";
        this.vaisseaux= new ArrayList<>();
    }

    /** Ajoute un vaisseau créer au préalable à la flotte
     * @param vaisseau Un vaisseau de la classe Vaisseau*/
    public void ajoute(Vaisseau vaisseau) {
        this.vaisseaux.add(vaisseau);
    }

    /** Ajoute un vaisseau à la flotte grâce à son nom, sa puissance de feu et son nombre de passagers
     * @param nom Un String qui est le nom du vaisseau
     * @param puissanceDeFeu Un int qui est sa puissance de feu
     * @param nombrePassagers Un int qui est son nombre de passagers*/
    public void ajoute(String nom, int puissanceDeFeu, int nombrePassagers) {
        this.vaisseaux.add(new Vaisseau(nom, puissanceDeFeu, nombrePassagers));
    }

    /** Ajoute un vaisseau à la flotte avec son nom et sa puissance de feu
     * @param nom Un String qui est le nom du vaisseau
     * @param puissanceDeFeu Un int qui est sa puissance de feu*/
    public void ajoute(String nom, int puissanceDeFeu) {
        this.vaisseaux.add(new Vaisseau(nom, puissanceDeFeu));
    }

    /** Retourne le nom de la flotte
     * @return Le nom en String*/
    public String getNom() {
        return this.nom;
    }

    /** Retourne la puissance de feu totale de la flotte
     * @return Un int qui est la puissance totale de la flotte*/
    public int totalPuissance() {
        int puissance = 0;
        for (Vaisseau vaisseau : this.vaisseaux) {
            puissance += vaisseau.getPuissance();
        }
        return puissance;
    }

    /** Retourne le nombre de vaisseaux dans la flotte
     * @return Un int qui est le nombre de vaisseaux dans la flotte*/
    public int nombreVaisseaux() {
        return this.vaisseaux.size();
    }

}
