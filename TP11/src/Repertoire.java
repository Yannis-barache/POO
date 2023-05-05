import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface Repertoire{
    public static final int PAS_DE_TRI = 0;
    public static final int TRI_PAR_ORDRE_ALPHABETIQUE = 1;
    public static final int TRI_PAR_NOMBRE_DE_NUMERO = 2;    
    
    /**
     * permet d'ajouter un contact dont on renseigne le nom et le numéro de téléphone
     */
    public void ajouteContact(String nom, String numero);
    /**
     * Cette méthode permet de modifier le nom d'un contact
     * Elle propage une exception si le nom passé en paramètre
     * ne correspond à aucun contact du répertoire 
     */
    public void modifieContact(String nom, String nouveauNom) throws PasDeContactException;
    
     /**
     * Cette méthode permet de supprimer totalement un contact
     * Elle propage une exception si le nom passé en paramètre
     * ne correspond à aucun contact du répertoire 
     */
    public void supprimeContact(String nom) throws PasDeContactException;
    /**
     * renvoie la liste des noms de tous les contacts du répertoire
     */
    public List<String> getNoms();    
    /**
     * renvoie la liste triée des noms de tous les contacts du répertoire 
     * La liste est triée en fonction de la valeur du paramètre typeDeTri
     * PAS_DE_TRI -> pas de tri spécifique 
     * TRI_PAR_ORDRE_ALPHABETIQUE -> les noms sont triés par ordre alphabétique
     * TRI_PAR_NOMBRE_DE_NUMERO -> le nom des contacts sont triés par ordre
     * décroissant de leur nombre de numéros de téléphone
     */
    public List<String> getNoms(int typeDeTri);

    /**
     * renvoie la liste de tous les numéros de téléphone du contact dont
     * le nom est passé en paramètre
     */
    public List<String> getNumeros(String nom);
    /**
     * renvoie la liste des noms de tous les contacts associés
     * au numéro de téléphone passé en paramètre
     * Cette méthode propage une exception si le nom passé en paramètre
     * ne correspond à aucun contact du répertoire 
     */    
    public List<String> rechercheNumero(String numero)  throws PasDeContactException;
    /**
     * permet d'initialiser le répertoire avec quelques contacts de sorte
     * à avoir un jeu d'essai non vide
     */   
    public void initRepertoire();
}
class PasDeContactException extends Exception{
}
