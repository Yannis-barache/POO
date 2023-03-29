import java.util.List;
import java.util.ArrayList;
import java.lang.Math;   

public class Aquarium {

    private List<PetitPoisson> petitsPoissons;
    private List<GrosPoisson> grosPoissons;

    public Aquarium(){
        int nbrGrosPoissons =0;
        petitsPoissons = new ArrayList<>();
        grosPoissons = new ArrayList<>();
    }

    public int getHauteur(){
        return 50;
    }

    public int getLargeur(){
        return 120;
    }

    public Dessin getDessin(){
        Dessin dessin = new Dessin();
        for (PetitPoisson petitPoisson: this.petitsPoissons){
            dessin.union(petitPoisson.getDessin()); //ajoute un poisson
        }
        for (GrosPoisson grosPoisson : this.grosPoissons){
            dessin.union(grosPoisson.getDessin()); //ajoute un poisson

        }
        
        return dessin;
    }

    public void evolue(){
        for (PetitPoisson petitPoisson: this.petitsPoissons){
            petitPoisson.evolue();
        }
        for (GrosPoisson grosPoisson : this.grosPoissons){
            grosPoisson.evolue(); 
        }
    }
}