public class Depense{
    private double montant;
    private String produit;
    private Personne payeur;

    /** Créer une dépense
     * @param personne Une personne 
     * @param montant Un double qui représente le prix du produit
     * @param produit Un String qui décrit ce qu'est le produit
     */
    public Depense(Personne personne, double montant, String produit){
        this.payeur=personne;
        this.montant=montant;
        this.produit=produit;
    }

    /** Retourne le nom du produit
     * @return le nom du produit
     */

    public String getProduit(){
        return this.produit;
    }


    /** Retourne le prix du produit
     * @return le prix du produit
     */
    public double getMontant(){
        return this.montant;
    }

    /** Retourne la personne ayant acheté le produit
     * @return La personne
     */
    public Personne getPersonne(){
        return this.payeur;
    }

    
    
}