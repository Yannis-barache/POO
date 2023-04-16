import java.util.List;
import java.util.ArrayList;
import java.lang.Exception;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Zoo {
    private String nom;
    private List<Animaux> animaux;
    private List<Enclos> enclos;

    /** Crée un zoo
     * @param nom le nom du zoo
     */

    public Zoo(String nom){
        this.nom=nom;
        this.animaux=new ArrayList<>();
        this.enclos=new ArrayList<>();
    }

    /** Retourne le nom du zoo
     * @return le nom du zoo
     */
    public String getNom() {
        return this.nom;
    }

    /** Retourne la liste des animaux du zoo
     * @return la liste des animaux du zoo
     */
    public List<Animaux> getAnimaux() {
        return this.animaux;
    }

    /** Retourne la liste des enclos du zoo
     * @return la liste des enclos du zoo
     */
    public List<Enclos> getEnclos() {
        return this.enclos;
    }

    /** Ajoute un animal au zoo
     * @param animal l'animal à ajouter au zoo
     */
    public void accueillirAnimal(Animaux animal, Enclos enclos) {
        boolean trouve=false;
        for (Enclos enclos1 : this.enclos) {
            if (enclos1.getNom().equals(enclos.getNom())) {
                trouve=true;
                enclos1.ajouteAnimal(animal);
                this.animaux.add(animal);
            }
        }
        if (!trouve) {
            System.out.println("L'enclos "+enclos.getNom()+" n'existe pas");
        }

    }

    /** Ajoute un enclos au zoo
     * @param enclos l'enclos à ajouter au zoo
     */
    public void ajouteEnclos(Enclos enclos){
        this.enclos.add(enclos);
        for (Animaux animal : enclos.getAnimaux()){
            this.animaux.add(animal);
        }
    }

    /** Soigne l'animal passée en paramètre si il est bléssé et dans un enclos
     * @param nomAnimal le nom de l'animal à soigner
     */
    public void soigner(String nomAnimal){
        boolean trouve=false;
        for (Animaux animal : this.animaux) {
            if (animal.getNom().equals(nomAnimal) && animal.getBlessure() && animal.getEnclos()!=null ) {
                animal.setBlessure(false);
                trouve=true;
                System.out.println("L'animal "+nomAnimal+" a été soigné");
            }else if (animal.getNom().equals(nomAnimal) && animal.getBlessure() && animal.getEnclos()==null ) {
                System.out.println("L'animal "+nomAnimal+" n'est pas dans un enclos");
                trouve=true;
            }else if (animal.getNom().equals(nomAnimal) && !animal.getBlessure() && animal.getEnclos()!=null ) {
                System.out.println("L'animal "+nomAnimal+" n'est pas blessé");
                trouve=true;
            }
        }
        if (!trouve) {
            System.out.println("L'animal "+nomAnimal+" n'existe pas");
        }
    }

    /** Retourne la liste des animaux dans l'enclos passé en paramètre
     * @param nomEnclos le nom de l'enclos
     * @return la liste des animaux dans l'enclos
     * @throws NoSuchElementException si l'enclos n'existe pas
     */
    public String listerAnimauxDansEnclos(String nomEnclos) throws NoSuchElementException {
        String retour="Les animaux dans l'enclos \""+nomEnclos+"\" sont : ";
        boolean enclosExiste = false;
        for (Enclos enclos : this.enclos) {
            if (enclos.getNom().equals(nomEnclos)) {
                enclosExiste = true;
                for (Animaux animal : enclos.getAnimaux()) {
                    retour+=animal.getNom()+" ";
                }
            }
        }
        if (!enclosExiste) {
            throw new NoSuchElementException("L'enclos \""+nomEnclos+"\" n'existe pas");
        }
        return retour;
    }

    /** Retourne la liste des animaux dans le zoo triée par nom
     * @return la liste des animaux dans le zoo triée par nom
     */
    public List<Animaux> trie(){
        List<Animaux> animauxTries=new ArrayList<>(this.animaux);
        Collections.sort(animauxTries, new ComparateurNom());
        return animauxTries;
    }

    /** Retourne l'animal le plus lourd du zoo
     * @return l'animal le plus lourd du zoo
     */
    public Animaux getAnimalLePlusLourd(){
        return Collections.max(this.animaux, new ComparateurPoids());
    }


    /** Retourne une chaîne de caractères représentant le zoo
     * @return une chaîne de caractères représentant le zoo
     */
    @Override
    public String toString(){
        String retour="Le zoo de "+this.nom+" "+ "contient \n [";
        for (Enclos enclos : this.enclos) {
            retour+=enclos.toString();
        }
        return retour+"]";
    }



}


