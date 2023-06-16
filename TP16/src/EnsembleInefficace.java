import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class EnsembleInefficace<T> extends AbstractSet<T> {

    private List<T>  listeInterne;

    public EnsembleInefficace() {
        this.listeInterne = new ArrayList<>();
    }

    public int size() {
        return this.listeInterne.size();
    }

    public Iterator<T> iterator() {
        return this.listeInterne.iterator();
    }

    @Override
    public boolean add(T e) {
        if(this.listeInterne.contains(e)){
            return false;
        }
        this.listeInterne.add(e);
        return true;
    }

}