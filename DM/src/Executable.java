import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

public class Executable {
    public static void main(String [] args){

        // Création des enclos
        Enclos enclos1=new Enclos("enclos des lions",50);
        Enclos enclos2=new Enclos("enclos des serpents",23);
        Enclos enclos4=new Enclos("enclos des s",23);

        // Création des animaux
        Serpents serpent1=new Serpents("Kaa",30,true,false);
        Lions lion1=new Lions("Simba",55,true,false);
        Lions lion2=new Lions("Mufasa",120,false,true);
        Lions lion3=new Lions("Scar",125,true,false);
        Lions lion4=new Lions("Nala",80,true,false);


        // Ajout des animaux dans les enclos
        enclos1.ajouteAnimal(lion1);
        enclos1.ajouteAnimal(lion2);
        enclos2.ajouteAnimal(serpent1);


        // Création du zoo
        Zoo zoo=new Zoo("Beauval");
        zoo.ajouteEnclos(enclos1);
        zoo.ajouteEnclos(enclos2);
        zoo.accueillirAnimal(new Lions("Toto", 10, true, false), enclos1);



        // Les assertions concernant les méthodes de la classe Enclos
        assert enclos1.getNom().equals("enclos des lions");
        assert enclos1.getSuperficie()==50;
        assert enclos1.getAnimaux().size()==3;
        assert enclos1.getAnimaux().get(0).equals(lion1);
        assert enclos1.getAnimaux().get(1).equals(lion2);


        // Les assertions concernant les méthodes de la classe Serpents
        assert serpent1.getNom().equals("Kaa");
        assert serpent1.getPoids()==30;
        assert serpent1.getBlessure();
        assert serpent1.getEnclos().equals(enclos2);
        assert !serpent1.getEnclos().equals(enclos1);

        // Les assertions concernant les méthodes de la classe Lions
        assert lion1.getNom().equals("Simba");
        assert lion1.getPoids()==55;
        assert lion1.getBlessure();
        assert lion1.getEnclos().equals(enclos1);
        assert !lion1.getEnclos().equals(enclos2);

        // Les assertions concernant les méthodes de la classe Zoo
        assert zoo.getAnimalLePlusLourd().equals(lion2);
        zoo.accueillirAnimal(lion3, enclos1);
        assert zoo.getAnimalLePlusLourd().equals(lion3);
        assert zoo.getAnimaux().size()==5;
        assert zoo.getEnclos().size()==2;
        assert zoo.getEnclos().get(0).equals(enclos1);
        assert zoo.getEnclos().get(1).equals(enclos2);

        //Test du soin
        assert lion1.getBlessure();
        zoo.soigner("Simba");
        assert !lion1.getBlessure();
        System.out.println("Le soin a bien été effectué");

        System.out.println("");


        // Essai d'ajout d'un animal dans un enclos qui n'existe pas
        try{
            System.out.println(zoo.listerAnimauxDansEnclos("Je ne suis pas un enclos"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("");


        // Essai d'ajout d'un animal dans un enclos qui existe
        try{
            System.out.println(zoo.listerAnimauxDansEnclos("enclos des lions"));
        }catch(Exception e){
            System.out.println("");
            System.out.println(e.getMessage());
        }

        System.out.println("");
        System.out.println("Les animaux du zoo sont :");
        System.out.println(zoo.getAnimaux());
        System.out.println("");
        System.out.println("Après le tri par nom des animaux du zoo :");
        System.out.println(zoo.trie());

        System.out.println("");

        System.out.println(zoo.toString());

        System.out.println("");
        System.out.println("Test des bruits des animaux :");
        lion1.son();
        serpent1.son();








    }
}
