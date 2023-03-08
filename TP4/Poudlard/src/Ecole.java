import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ecole {
    private String nom;
    private List<Maison> maisons;

    public Ecole(String nom) {
        this.nom = nom;
        this.maisons = new ArrayList<>();

    }

    /**
     * Ajoute une maison à l'école
     *
     * @param maison Une instance de la classe Maison qui va être rajoutée
     */
    public void ajouter(Maison maison) {
        this.maisons.add(maison);

    }

    /**
     * Retourne la maison avec le plus d'élèves
     *
     * @return La maison avec le plus d'élèves dans l'école.
     */
    public Maison plusGrandeMaison() {
        Maison plusGrandeMaison = new Maison("Barachicha");
        for (Maison maison : this.maisons) {
            if (maison.nombreEleve() > plusGrandeMaison.nombreEleve()) {
                plusGrandeMaison = maison;
            }
        }
        return plusGrandeMaison;
    }

    /**
     * Retourne la liste des élèves courageux
     * @return La liste des élèves courageux
     */
    public List<Sorcier> lesCourageux(){
        List<Sorcier> courageux = new ArrayList<>();
        for (Maison maison : this.maisons){
            for (Sorcier sorcier : maison.getEleves()){
                if (sorcier.estCourageux()){
                    courageux.add(sorcier);
                }
            }
        }
        return courageux;
    }

    /**
     * Retourne la liste des élèves triés par ordre croissant de courage
     *
     * @return La liste des élèves triés par ordre croissant de courage
     */
    public List<Sorcier> elevesTriesParCourage(){
        List<Sorcier> elevesTriesParCourage = new ArrayList<>();
        for (Maison maison : this.maisons){
            for (Sorcier sorcier : maison.getEleves()){
                elevesTriesParCourage.add(sorcier);
            }
        }
        Collections.sort(elevesTriesParCourage);
        return elevesTriesParCourage;
    }

    /** Retourne la liste de tous les élèves de l'école
     * @return La liste des sorciers
     */

    public List<Sorcier> getEleves(){
        List<Sorcier> tout_eleves= new ArrayList<>();
        for (Maison maison:this.maisons){
            for (Sorcier sorcier :maison.getEleves()){
                tout_eleves.add(sorcier);
            }
        }
        return tout_eleves;
    }

    /** Retourne true si deux écoles ont le même nom, et les mêmes maisons false sinon
     *  @param obj Un Object qui représente l'école à comparer
     *  @return Un boolean qui représente si les deux écoles sont les mêmes ou non*/
    @Override 
    public boolean equals(Object obj){
        if (obj==this){return true;}
        if (obj==null){return false;}
        if (obj instanceof Ecole){
            Ecole ecole = (Ecole) obj;
            return this.nom==ecole.nom && this.maisons==ecole.maisons;
        }
        return false;
    }

}