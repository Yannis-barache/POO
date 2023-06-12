package TD16;

import java.util.List;
import java.util.Iterator;

public class Iter<T> {

    public Iter(){
    }

    public void afficherElem(List<T> liste){
        Iterator<T> iterator = liste.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());}
    }
    
}
