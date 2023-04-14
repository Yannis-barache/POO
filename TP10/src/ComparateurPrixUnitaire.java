import java.util.Comparator;

import java.util.Comparator;

public class ComparateurPrixUnitaire implements Comparator<Produit>{

    @Override
    public int compare(Produit produit1, Produit produit2) {
        return (int) (produit1.getPrixUnitaire() - produit2.getPrixUnitaire());
    }
}
