import java.util.List;
import java.util.ArrayList;
public class Cave {
    private List<Bouteille> bouteilles;
    public Cave(){
        this.bouteilles = new ArrayList<Bouteille>();
    }
    public void ajouteBouteille(String region, String appellation, int millesime){
        Bouteille b = new Bouteille(region, appellation, millesime);
        this.bouteilles.add(b);
    }
    public int nbBouteilles(){
        return this.bouteilles.size();
    }
    public int nbBouteillesDeRegion(String region){
        int nb = 0;
        for (Bouteille b : this.bouteilles){
            if (b.getRegion().equals(region)){
                nb++;
            }
        }
        return nb;
    }
    public Bouteille plusVieilleBouteille(){
        Bouteille b = this.bouteilles.get(0);
        for (Bouteille b2 : this.bouteilles){
            if (b2.getMillesime() < b.getMillesime()){
                b = b2;
            }
        }
        return b;
    }

    public boolean contient(String region, String appellation, int millesime){
        Bouteille b = new Bouteille(region, appellation, millesime);
        return this.bouteilles.contains(b);
    }

    
    
}
