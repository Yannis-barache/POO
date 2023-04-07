import java.util.Comparator;

/** Bibliothèque de la classe Personne */ 
public class ComparateurPersonne implements Comparator<Personne>{
    
    /** Compare deux personnes
     * @param p1 la première personne
     * @param p2 la deuxième personne
     * @return 1 si p1 est plus grand que p2, -1 si p1 est plus petit que p2, 0 sinon
     */
    @Override
    public int compare(Personne p1,Personne p2){
        if (p1.getAge() > p2.getAge()){
            return 1;
        } else if (p1.getAge() < p2.getAge()){
            return -1;
        }
        return 0;
    }
    
    
}
