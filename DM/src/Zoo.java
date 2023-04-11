import java.util.List;
import java.util.ArrayList;
import java.lang.Exception;

public class Zoo {
    private String nom;
    private List<Animaux> animaux;
    private List<Enclos> enclos;

    public Zoo(String nom){
        this.nom=nom;
        this.animaux=new ArrayList<>();
        this.enclos=new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public List<Animaux> getAnimaux() {
        return this.animaux;
    }

    public List<Enclos> getEnclos() {
        return this.enclos;
    }

    public void accueillirAnimal(Animaux animal, Enclos enclos) {
        boolean trouve=false;
        for (Enclos enclos1 : this.enclos) {
            if (enclos1.getNom().equals(enclos.getNom())) {
                trouve=true;
                enclos1.ajouteAnimal(animal);
            }
        }
        if (!trouve) {
            System.out.println("L'enclos "+enclos.getNom()+" n'existe pas");
        }

    }
    public void ajouteEnclos(Enclos enclos){
        this.enclos.add(enclos);
        for (Animaux animal : enclos.getAnimaux()){
            this.animaux.add(animal);
        }
    }

    public void soigner(String nomAnimal){
        boolean trouve=false;
        for (Animaux animal : this.animaux) {
            if (animal.getNom().equals(nomAnimal) && animal.getBlessure() && animal.getEnclos()!=null ) {
                animal.setBlessure(false);
                trouve=true;
            }
            if (animal.getNom().equals(nomAnimal) && animal.getBlessure() && animal.getEnclos()==null ) {
                System.out.println("L'animal "+nomAnimal+" n'est pas dans un enclos");
                trouve=true;
            }
            if (animal.getNom().equals(nomAnimal) && !animal.getBlessure() && animal.getEnclos()!=null ) {
                System.out.println("L'animal "+nomAnimal+" n'est pas blessé");
                trouve=true;
            }
        }
        if (!trouve) {
            System.out.println("L'animal "+nomAnimal+" n'existe pas");
        }
    }

    public String listerAnimauxDansEnclos(String nomEnclos) throws Exception{
        String retour="";
        boolean trouve=false;
        for (Enclos enclos : this.enclos) {
            if (enclos.getNom().equals(nomEnclos)) {
                trouve=true;
                for (Animaux animal : enclos.getAnimaux()) {
                    retour+=animal.getNom()+"\n";
                }
            }
        }
        if (!trouve) {
            throw new Exception("L'enclos "+nomEnclos+" n'existe pas");
        }
        return retour;
    }

    @Override
    public String toString(){
        String retour="Le zoo de "+this.nom+" contient \n [";
        for (Enclos enclos : this.enclos) {
            retour+=enclos.toString();
        }
        return retour+"]";
    }
}
