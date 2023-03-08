import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Maison {
    private String nom;
    private List<Sorcier> eleves;

    public Maison(String nom) {
        this.eleves = new ArrayList<>();
        this.nom = nom;
    }

    /** Ajoute un sorcier à la maison
     *  @param nomSorcier Un String qui représente le nom du sorcier
     *  @param courage Un int qui représente la valeur de courage du sorcier
     *  @param sagesse Un int qui représente la valeur de sagesse du sorcier
     *  @return Un boolean qui représente si l'ajout a été effectué ou non*/

    public boolean ajoute(String nomSorcier, int courage, int sagesse) {
        Sorcier ajout = new Sorcier(nomSorcier, courage, sagesse);
        if (this.eleves.contains(ajout)) {
            return false;

        }
        eleves.add(ajout);
        return true;

    }
    /** Retourne le nombre de sorciers dans la maison
     *  @return Un int qui représente le nombre de sorciers dans la maison*/
    public int nombreEleve() {
        return this.eleves.size();
    }

    /** Retourne la liste de sorcier présent dans la maison
     * @return La liste de sorciers dans la maison*/
    public List<Sorcier> getEleves(){
        return this.eleves;
    }

    /** Retourne un booléen à true si dans les élèves de la maison il y en a au moins 1 courageux
     * @return Un booléen qui représente si un d'entre eux est courageux */
    public boolean contientCourageux(){
        for (Sorcier sorcier : this.eleves){
            if (sorcier.estCourageux()){
                return true;
            }
        }
        return false;
    }

    /** Retourne le sorcier avec la valeur de courage la moins haute dans la maison
     * @return Le sorcier le moins courageux*/
    public Sorcier leMoinsCourageux(){
        Sorcier moinsCourageux=new Sorcier("gabin", 40, 0);
        for (Sorcier sorcier : this.eleves){
            if (sorcier.getCourage() < moinsCourageux.getCourage()){
                moinsCourageux=sorcier;
            }
            
        }
        return moinsCourageux;
    }

    /** Retourne le sorcier avec la valeur de sagesse la plus haute de la maison
     * @return Le sorcier le plus sage*/
    public Sorcier lePlusSage(){
        Sorcier plusSage=new Sorcier("gabin", 0, 0);
        for (Sorcier sorcier : this.eleves){
            if (sorcier.getSagesse() > plusSage.getSagesse()){
                plusSage=sorcier;
            }
            
        }
        return plusSage;
    }

    /** Trie par ordre croissant les élèves en fonction de leur courage*/
    public void trierParCourage(){
        Collections.sort(this.eleves);
    }
}
    

