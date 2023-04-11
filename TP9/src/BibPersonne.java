import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BibPersonne {
    private BibPersonne() {
    }

    /** Trie par âge une liste de personne
     * @param personnes la liste de personne à trier
     * @return la liste de personne triée
     * @throws NullPointerException si la liste est null
     */
    public static List<Personne> trierParAge(List<Personne> personnes) throws NullPointerException{
        List<Personne> copie = new ArrayList<>(personnes);
        Collections.sort(copie,new ComparateurPersonne());
        return copie;
    }

    /** Renvoie l'écart d'âge minimum entre deux personnes d'une liste
     * @param personnes la liste de personne
     * @return l'écart d'âge minimum entre deux personnes d'une liste
     * @throws NullPointerException si la liste est null
     */
    public static int ecartMin(List<Personne> personnes) throws NullPointerException{
        int min = 200;
        List<Personne> personnesTriees = trierParAge(personnes);
        for (int i = 0; i < personnesTriees.size() - 1; i++){
            int ecart = personnesTriees.get(i+1).getAge() - personnesTriees.get(i).getAge();
            if (ecart < min){
                min = ecart;
            }
        }
        return min;

    }

    

    
}
