import java.util.List;
import java.util.ArrayList;

public class Aquarium {

    private List<PetitPoisson> petitsPoissons;
    private List<GrosPoisson> grosPoissons;
    private List<Algue> algues;

    public Aquarium(){
        petitsPoissons = new ArrayList<>();
        grosPoissons = new ArrayList<>();
        algues = new ArrayList<>();
        grosPoissons.add(new GrosPoisson(5,5));
        algues.add(new Algue(10));
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

        for (Algue algue : this.algues){
            dessin.union(algue.getDessin());
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

        for (Algue algue : this.algues){
            algue.ondule();
        }
    }
}