import java.util.Comparator;

public class ComparateurComplexe implements Comparator<Complexe> {
    
    /** Compare deux nombres complexes
     * @param c1 le premier nombre complexe
     * @param c2 le deuxième nombre complexe
     * @return 1 si c1 est plus grand que c2, -1 si c1 est plus petit que c2, 0 sinon
     */ 
    @Override
    public int compare(Complexe c1,Complexe c2){
        if (c1.getReel() > c2.getReel()){
            return 1;
        } else if (c1.getReel() < c2.getReel()){
            return -1;
        }
        return 0;
    }
}
    

