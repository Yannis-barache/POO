import java.util.List;
import java.util.ArrayList;

public interface Etablissement{


    public List<String> getSelection(List<Etudiant> listeEtudiants);

    public int getNbPlaces();
}