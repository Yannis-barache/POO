import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Iterateur<T> implements Iterator<T> {
	private List<T> valeurs;
	private int position;
	private int lastPosition;

        
    public Iterateur(List<T> array) {
        this.valeurs = array;
        this.position = 0;
        while (this.position < this.valeurs.size() && this.valeurs.get(this.position) == null) {
            this.position++;
        }
        this.lastPosition = -1;


	
    }

    @Override
    public T next() throws NoSuchElementException {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.lastPosition = this.position;
        while (this.position < this.valeurs.size() && this.valeurs.get(this.position) == null) {
            this.position++;
        }
        return this.valeurs.get(this.position);









	
    }

    @Override
    public boolean hasNext() {
        return this.position < this.valeurs.size();
    }
	
    @Override
    public void remove() {
        if (this.lastPosition == -1) {
            throw new IllegalStateException();
        }
        this.valeurs.remove(this.lastPosition);
        this.position--;
        this.lastPosition--;


	
    }
}	    
