import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EcolePolitique implements Etablissement{
    private String nom;
    private int nbPlaces;

    public EcolePolitique(String nom){
        this.nom = nom;
        this.nbPlaces = 1;
    }

    @Override
    public List<String> getSelection(List<Etudiant> listeEtudiants){
        List<String> selection = new ArrayList<String>();
        Collections.sort(listeEtudiants,new ComparateurPolitique());

        return selection;
    }

    @Override
    public int getNbPlaces(){
        return this.nbPlaces;
    }
    
}
