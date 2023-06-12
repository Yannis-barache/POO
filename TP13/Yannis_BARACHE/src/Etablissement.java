import java.util.List;
import java.util.ArrayList;

public interface Etablissement{


    /**
     * Renvoie la séléction d'une école
     * @return La liste des sélectionnées
     */
    public List<Etudiant> getSelection(List<Etudiant> listeEtudiants);

    /**
     * Renvoie le nombre de places de l'école
     * @return Le nombre de places
     */
    public int getNbPlaces();
}