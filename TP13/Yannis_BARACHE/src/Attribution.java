import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Attribution {

    private Attribution() {
    }


    /**
     * Renvoie une map avec les étudiants et les établissements qui les ont sélectionnés
     * @param etu La liste des étudiants
     * @param etablissements La liste des établissements
     * @return La map avec les étudiants et les établissements qui les ont sélectionnés
     */
    public static Map<Etudiant,List<Etablissement>> listePrincipale(List<Etudiant> etu,List<Etablissement> etablissements){

        Map<Etudiant,List<Etablissement>> map = new HashMap<Etudiant,List<Etablissement>>();
        for(Etudiant e : etu){
            map.put(e, new ArrayList<Etablissement>());
        }
        for(Etablissement e : etablissements){
            for(Etudiant etudiant : e.getSelection(etu)){
                map.get(etudiant).add(e);
            }
        }
        return map;

        
    }

    /**
     * Renvoie l'étudiant qui a le meilleur score de télékinésie
     * @param etu La liste des étudiants
     * @return L'étudiant qui a le meilleur score de télékinésie
     * @throws PasDeTelEtudiant Si la liste est vide
     */
    public static Etudiant maximum(List<Etudiant> etu) throws PasDeTelEtudiant{
        
        Etudiant max = etu.get(0);
        if (etu.size() == 0) {
            throw new PasDeTelEtudiant();
        }
        for(Etudiant e : etu){
            if(e.getTelepathie() > max.getTelepathie()){
                max = e;
            }
        }
        return max;
    }
    

    
}


class PasDeTelEtudiant extends Exception{
    public PasDeTelEtudiant(){
    }
}
