import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ecole {
    private String nom;
    private List<Maison> maisons;

    public Ecole(String nom){
        this.nom=nom;
        this.maisons = new ArrayList<>();

    }
    /** Ajoute une maison à l'école
     *  @param maison Une instance de la classe Maison qui va être rajoutée*/
    public void ajouter (Maison maison){
        this.maisons.add(maison);

    }
    /** Retourne la maison avec le plus d'élèves
     * @return La maison avec le plus d'élèves dans l'école.*/
    public Maison plusGrandeMaison(){
        Maison plusGrandeMaison=new Maison("Barachicha");
        for (Maison maison : this.maisons){
            if (maison.nombreEleve()> plusGrandeMaison.nombreEleve()){
                plusGrandeMaison=maison;
            }
        }
        return plusGrandeMaison;
    }   

   // public ArrayList<Sorcier> lesCourageux(){
//   List<Sorcier> lesCourageux= new ArrayList<>();

  //      return lesCourageux;

    //}
}
