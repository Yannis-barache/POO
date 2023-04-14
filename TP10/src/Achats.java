import java.util.HashMap;
import java.util.Map;

public class Achats {
    private Map<Produit, Integer> achats;

    public Achats() {
        this.achats = new HashMap<>();
    }

    public Map<Produit, Integer> getAchats() {
        return this.achats;
    }

    public void ajouteAchats(Produit produit, int quantite){
        if (this.achats.containsKey(produit)){
            this.achats.put(produit, this.achats.get(produit) + quantite);
        }
        else{
            this.achats.put(produit, quantite);
        }

    }

    public double prixTotal(){
        double prixTotal = 0;
        for (Produit produit : this.achats.keySet()){
            prixTotal += produit.getPrixUnitaire() * this.achats.get(produit);
        }
        return prixTotal;
    }




    @Override
    public String toString() {
        return "Achats [achats=" + achats + "]";
    }



    
}
