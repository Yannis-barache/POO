import java.util.List;
import java.util.ArrayList;

public class Enclos {
    private String nom;
    private int superficie;
    private List<Animaux> animaux;

    /**
     * @param nom le nom de l'enclos
     * @param superficie la superficie de l'enclos en m2
     */
    public Enclos(String nom,int superficie){
        this.nom=nom;
        this.superficie=superficie;
        this.animaux=new ArrayList<>();
    }

    /**
     * @return le nom de l'enclos
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * @return la superficie de l'enclos en m2
     */

    public int getSuperficie() {
        return this.superficie;
    }

    /**
     * @return la liste des animaux de l'enclos
     */
    public List<Animaux> getAnimaux() {
        return this.animaux;
    }

    /** Ajoute un animal à l'enclos
     * @param animal l'animal à ajouter à l'enclos
     */
    public void ajouteAnimal(Animaux animal){
        if (this.animaux.size()==0) {
            this.animaux.add(animal);
            animal.setEnclos(this);
        }else{
            if (this.animaux.get(0).getClass()==animal.getClass()) {
                this.animaux.add(animal);
                animal.setEnclos(this);
            }else{
                System.out.println("L'enclos "+this.nom+" ne peut contenir que des "+this.animaux.get(0).getClass().getName());
            }
        }
    }

    /**
     * @return la description de l'enclos
     */
    @Override
    public String toString(){
        String retour="";
        for (Animaux animal : this.animaux) {
            retour+="dans l'"+this.nom+" ("+this.superficie+" m2"+") "+ animal.toString()+"\n" ;
        }
        return retour;
    }



}
