import java.util.ArrayList;
import java.util.List;

public class Ville {
    private String nom;
    private List<Magasin> magasins;
    
    public Ville(String nom){
        this.nom=nom;
        this.magasins=new ArrayList<>();
    
    }
    public void ajouteMagasin(String nom, boolean lundi,boolean dimanche){
        magasins.add(new Magasin (nom,lundi,dimanche));


    }

    public String getNom(){
        return this.nom;
        
    }
    public List<Magasin> ouvertsLeLundi(){
        List <Magasin> lundi=new ArrayList<>();
        for (Magasin magasin : this.magasins){
            if (magasin.ouvertLundi()){
                lundi.add(magasin);
            }
        }
        return lundi;
    }   

    @Override
    public String toString(){
        return this.getNom()+" + "+ magasins;
    }

}