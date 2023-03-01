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

    public void ajouter (Maison maison){
        this.maisons.add(maison);

    }
    
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
