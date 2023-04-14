public class Produit {
    private String nom;
    private double prixUnitaire;

    public Produit(String nom, double prixUnitaire) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
    }


    public String getNom() {
        return this.nom;
    }

    public double getPrixUnitaire() {
        return this.prixUnitaire;
    }

    @Override
    public String toString() {
        return "(" + this.getNom() + ", " + this.getPrixUnitaire() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Produit) {
            Produit prod = (Produit) o;
            return this.nom == prod.nom && this.prixUnitaire == prod.prixUnitaire;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int nom = 0;
        for (int i = 0; i < this.nom.length(); i++) {
            nom += this.nom.charAt(i) * i;
        }
        return 78 * 31 + 45 * nom;
    }
    
    
}
