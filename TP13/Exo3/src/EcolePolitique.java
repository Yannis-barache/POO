import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EcolePolitique implements Etablissement{
    private String nom;
    private int nbPlaces;

    /**
     * Constructeur de EcolePolitique
     * @param nom Le nom de l'école
     */
    public EcolePolitique(String nom){
        this.nom = nom;
        this.nbPlaces = 1;
    }


    /**
     * Renvoie la séléction d'une école de politique
     * @return La liste des sélectionnées
     */
    @Override
    public List<Etudiant> getSelection(List<Etudiant> listeEtudiants){
        List<Etudiant> copieListe = new ArrayList<Etudiant>(listeEtudiants);
        List<Etudiant> selection = new ArrayList<Etudiant>();
        Collections.sort(copieListe, new ComparateurPolitique());
        selection.add(copieListe.get(0));
        return selection;
    }

    /**
     * Renvoie le nombre de places de l'école de politique
     * @return Le nombre de places
     */
    @Override
    public int getNbPlaces(){
        return this.nbPlaces;
    }

    /**
     * Renvoie un string contenant le nom de l'école et le nombre de places
     * @return Le nom de l'école et le nombre de places
     */
    @Override
    public String toString(){
        return this.nom+" - "+this.nbPlaces+" place";
    }
    
}
