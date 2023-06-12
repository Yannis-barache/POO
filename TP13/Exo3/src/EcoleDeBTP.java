import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EcoleDeBTP implements Etablissement {
    private String nom;
    private int nbPlaces;

    /**
     * Constructeur de EcoleDeBTP
     * @param nom Le nom de l'école
     * @param nbPlaces Le nombre de places
     */
    public EcoleDeBTP(String nom, int nbPlaces) {
        this.nom = nom;
        this.nbPlaces = nbPlaces;
    }

    /**
     * Renvoie la séléction d'une école de BTP
     * @return La liste des sélectionnées
     */
    @Override
    public List<Etudiant> getSelection(List<Etudiant> listeEtu){
        List<Etudiant> listeEtudiants = new ArrayList<Etudiant>(listeEtu);
        List<Etudiant> selection = new ArrayList<>();
        Collections.sort(listeEtudiants, new ComparateurBTP());
        for (Etudiant etudiant : listeEtudiants) {
            if (selection.size() < this.nbPlaces) {
                selection.add(etudiant);
            } else {
                break;
            }
        }
        return selection;

    }

    /**
     * Renvoie le nombre de places de l'école de BTP
     * @return Le nombre de places
     */

    @Override
    public int getNbPlaces() {
        return this.nbPlaces;
    }

    /**
     * Renvoie un string contenant le nom de l'école et le nombre de places
     * @return Le nom de l'école et le nombre de places
     */
    @Override
    public String toString() {
        return this.nom + " - " + this.nbPlaces + " places";
    }

    
}
