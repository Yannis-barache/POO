import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;

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
        plusGrandeMaison=new Maison("Barachicha")
        for (Maison maison : this.maisons){
            if (maison.nombreEleve()> plusGrandeMaison){
                plusGrandeMaison=maison;
            }
        }
        return plusGrandeMaison;
    }   
}
