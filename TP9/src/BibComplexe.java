import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class BibComplexe {
    private BibComplexe() {
    }

    /** Trie par partie réelle une liste de nombres complexes
     * @param complexes la liste de nombres complexes à trier
     * @return la liste de nombres complexes triée
     * @throws NullPointerException si la liste est null
     */
    public static List<Complexe> trier(List<Complexe> complexes, Comparator<Complexe> comparator) throws NullPointerException{
        List<Complexe> copie = new ArrayList<>(complexes);
        Comparator<Complexe> comparateur = comparator ;
        Collections.sort(copie,comparateur);
        return copie;
    }




    
}
