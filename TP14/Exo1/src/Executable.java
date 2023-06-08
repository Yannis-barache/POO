package Exo1.src;
import java.util.ArrayList;
import java.util.List;

public class Executable {
    public static void main (String[] args){
        Ensemble ensemble= new Ensemble();
        ensemble.ajoute(0);
        ensemble.ajoute(1);
        ensemble.ajoute(2);
        ensemble.ajoute(3);
        ensemble.ajoute(4);
        Couple couple1 =new Couple(0,1);
        Couple couple2 = new Couple(0, 2);
        List<Contenant<Integer>> liste = new ArrayList<>();
        liste.add(couple2);
        liste.add(couple1);
        liste.add(ensemble);
        System.out.println(GestionContenants.contiennentTous(liste,0)); 

    }
    
}
