import java.util.HashSet;
import java.util.Set;

public class Ville {
    private String nom;
    private Set<Magasin> magasins;
    
    public Ville(String nom){
        this.nom=nom;
        this.magasins=new HashSet<>();
    
    }
    public void ajouteMagasin(String nom, boolean lundi,boolean dimanche){
        magasins.add(new Magasin (nom,lundi,dimanche));


    }

    public String getNom(){
        return this.nom;
        
    }

    public Set<Magasin> getMagasins(){
        return this.magasins;
    }
    
    public Set<Magasin> ouvertsLeLundi(){
        Set<Magasin> lundi=new HashSet<>();
        for (Magasin magasin : this.magasins){
            if (magasin.ouvertLundi()){
                lundi.add(magasin);
            }
        }
        return lundi;
    }   


   
    @Override
    public String toString(){
        return this.getNom()+" a comme magasins : "+ magasins;
    }

}