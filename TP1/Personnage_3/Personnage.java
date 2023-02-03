public class Personnage {
    private String nom;
    private int tailleBarbe;
    private int tailleOreilles;
    public Personnage (String nom , int barbe , int oreille ){
        this.nom= nom;
        this.tailleBarbe = barbe;
        this.tailleOreilles = oreille;
    }
    public String getNom(){
        return this.nom;
    }
    public int getBarbe(){
        return this.tailleBarbe;
    }
    public int getTailleOreilles(){
        return this.tailleOreilles;
    }
}
