
public class Pokemon implements Comparable <Pokemon >{
     private String nom;
     private Integer force;
    public Pokemon(String nom , int force){
        this.nom = nom.toLowerCase ();
        this.force = force;
    
    }
    
    @Override
    public String toString (){
        return "("+this.nom +", "+this.force+")";
    }

    @Override
    public int compareTo(Pokemon autrePokemon){
        return this.nom.length () - autrePokemon.nom.length ();
    }
}