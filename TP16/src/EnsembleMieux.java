import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class EnsembleMieux<T>   extends AbstractSet<T> {
    private List<T> listeInterne;
    private int nbElements ;
    
    public EnsembleMieux() {
        
        this.listeInterne = new ArrayList<>();      
        this.nbElements = 0;
        for (int i = 0; i < 10000; i++) {
            this.listeInterne.add(null);
        }
    }
    
    public int size() {
        return this.nbElements;	
    }
    
    public Iterator<T> iterator() {
        Iterateur<T> iterateur = new Iterateur<>(this.listeInterne);
        return iterateur;
    }
    
    
    @Override
    public boolean add(T elem) {
        if (elem == null) {
            return false;
        }
        int index = elem.hashCode() % this.listeInterne.size();
        if (index < 0) {
            index = -index;
        }
        if (this.listeInterne.get(index) == null) {
            this.listeInterne.set(index, elem);
            this.nbElements++;
            return true;
        }
        return false;
    



    }


    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }
        int index = o.hashCode() % this.listeInterne.size();
        if (index < 0) {
            index = -index;
        }
        
        return this.listeInterne.get(index).equals(o);

        






	
    }

    @Override 
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }
        if (o==this) {
            return true;
        }
        if (o instanceof EnsembleMieux) {
            EnsembleMieux<?> ensembleMieux = (EnsembleMieux<?>) o;
            return this.listeInterne.equals(ensembleMieux.listeInterne);
        }
        return false;
    }
}

