import java.util.Comparator;

import java.util.Comparator;

public class ComparateurComplexeNorme implements Comparator<Complexe>{
    
    @Override
    public int compare(Complexe c1, Complexe c2) {
        if (c1.getNorme() > c2.getNorme()){
            return 1;
        } else if (c1.getNorme() < c2.getNorme()){
            return -1;
        }   
        return 0;
    }
    
}
