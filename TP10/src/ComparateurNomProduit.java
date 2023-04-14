import java.util.Comparator;

public class ComparateurNomProduit implements Comparator<Produit>{

    @Override
    public int compare(Produit produit1, Produit produit2) {
        return produit1.getNom().compareTo(produit2.getNom());
    }

}