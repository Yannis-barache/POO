import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Maison {
    private String nom;
    private List<Sorcier> eleves;

    public Maison(String nom){
        this.eleves = new ArrayList<>();
        this.nom = nom;
    }

    public boolean ajoute (String nomSorcier, int courage, int sagesse){
        Sorcier ajout= new Sorcier(nomSorcier, courage, sagesse);
        if (this.eleves.contains(ajout)){
            eleves.add(ajout);
            return true;
        }
        return false;
    }

    public int nombreEleve(){
        return this.eleves.size();
    }

    public boolean contientCourageux(){
        for (Sorcier sorcier : this.eleves){
            if (sorcier.estCourageux()){
                return true;
            }
        }
        return false;
    }

    public Sorcier leMoinsCourageux(){
        Sorcier moinsCourageux=new Sorcier("gabin", 40, 0);
        for (Sorcier sorcier : this.eleves){
            if (sorcier.getCourage() < moinsCourageux.getCourage()){
                moinsCourageux=sorcier;
            }
            
        }
        return moinsCourageux;
    }
    
    public Sorcier lePlusSage(){
        Sorcier plusSage=new Sorcier("gabin", 0, 40);
        for (Sorcier sorcier : this.eleves){
            if (sorcier.getSagesse() > plusSage.getSagesse()){
                plusSage=sorcier;
            }
            
        }
        return plusSage;
    }

    public void trierParCourage(){
        Collections.sort(this.eleves);
    }
}
    

