package Exo1.src;
import java.util.HashSet;
import java.util.Set;

public class Ensemble implements Contenant<Integer>{
    private Set<Integer> listeIntegers;

    public Ensemble(){
        this.listeIntegers= new HashSet<>();
    }


    public void ajoute(Integer i){

        this.listeIntegers.add(i);
    }
    

    @Override
    public boolean contient(Integer elem){
        return this.listeIntegers.contains(elem);

    }
    
}
