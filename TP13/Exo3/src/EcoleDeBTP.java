import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EcoleDeBTP implements Etablissement {
    private String nom;
    private int nbPlaces;

    public EcoleDeBTP(String nom, int nbPlaces) {
        this.nom = nom;
        this.nbPlaces = nbPlaces;
    }

    @Override
    public List<String> getSelection(List<Etudiant> listeEtudiants) {
        List<String> selection = new ArrayList<String>();
        Collections.sort(listeEtudiants);
        for (Etudiant etudiant : listeEtudiants) {
            selection.add(etudiant.toString());
        }
        return selection;
    }

    @Override
    public int getNbPlaces() {
        return this.nbPlaces;
    }

    
}
