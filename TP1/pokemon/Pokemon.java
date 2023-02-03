public class Pokemon {
    private String nom;
    private int force;
    public Pokemon( String nomPokemon , int forcePokemon){
        this.nom =nomPokemon;
        this.force =forcePokemon;
    }
    public Pokemon(String nomPokemon){
        this (nomPokemon, 10);
    }
    public String getNom() {
        return this.nom;
    }
    public int getForce() {
        return this.force;
    }
    public void evolue(String newName, int newForce) {
        this.nom= newName;
        this.force= newForce;
    }
    public void evolue(String newName) {
        this.evolue(newName , this.force +10);
    }
    @Override
    public String toString(){
        return this.nom + "(force" +this.force + ")";
    }
}