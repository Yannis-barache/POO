import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RepertoireMap implements Repertoire {
    private Map<String,List<String>> monRepertoire;

    public RepertoireMap() {
        monRepertoire = new HashMap<String,List<String>>();
    }

    @Override
    public void ajouteContact(String nom, String numero) {
        if (monRepertoire.containsKey(nom)) {
            monRepertoire.get(nom).add(numero);
        } else {
            List<String> listeNumeros = new ArrayList<String>();
            listeNumeros.add(numero);
            monRepertoire.put(nom, listeNumeros);
        }
    }

    @Override
    public void modifieContact(String nom, String nouveauNom) throws PasDeContactException {
        if (monRepertoire.containsKey(nom)) {
            List<String> listeNumeros = monRepertoire.get(nom);
            monRepertoire.remove(nom);
            monRepertoire.put(nouveauNom, listeNumeros);
        } else {
            throw new PasDeContactException();
        }
    }

    /**
     * Cette méthode permet de supprimer totalement un contact
     * Elle propage une exception si le nom passé en paramètre
     * ne correspond à aucun contact du répertoire 
     */
    @Override
    public void supprimeContact(String nom) throws PasDeContactException{
        if (monRepertoire.containsKey(nom)){
            monRepertoire.remove(nom);
        } else{
            throw new PasDeContactException();
        }

    }

    @Override
    public List<String> getNoms() {
        return new ArrayList<String>(monRepertoire.keySet());
    }

    /**
     * renvoie la liste triée des noms de tous les contacts du répertoire 
     * La liste est triée en fonction de la valeur du paramètre typeDeTri
     * PAS_DE_TRI -> pas de tri spécifique 
     * TRI_PAR_ORDRE_ALPHABETIQUE -> les noms sont triés par ordre alphabétique
     * TRI_PAR_NOMBRE_DE_NUMERO -> le nom des contacts sont triés par ordre
     * décroissant de leur nombre de numéros de téléphone
     */
    public List<String> getNoms(int typeDeTri) {
        List<String> noms = this.getNoms();
        List<List<String>> listeRepertoire = new ArrayList<>();
        if(typeDeTri==1){
            Collections.sort(noms, new ComparateurNom());
        }
        if (typeDeTri==2){
            for (String personne : this.monRepertoire.keySet()){
                listeRepertoire.add(this.monRepertoire.get(personne));

            }
            Collections.sort(listeRepertoire, new ComparateurNbNum());
        }
        return noms;
    }

    @Override
    public List<String> getNumeros(String numero){
        return monRepertoire.get(numero);
    }

    /**
     * renvoie la liste des noms de tous les contacts associés
     * au numéro de téléphone passé en paramètre
     * Cette méthode propage une exception si le nom passé en paramètre
     * ne correspond à aucun contact du répertoire 
     */ 
    @Override   
    public List<String> rechercheNumero(String numero)  throws PasDeContactException{
        return new ArrayList<String>();
    }

    /**
     * permet d'initialiser le répertoire avec quelques contacts de sorte
     * à avoir un jeu d'essai non vide
     */   
    @Override
    public void initRepertoire(){
        this.ajouteContact("Sasa", "08 05 04 01 02");
        this.ajouteContact("Jean-jacques", "04 78 56 98 52");
        this.ajouteContact("Mamie", "02 51 30 24 85");

    }



    
}
