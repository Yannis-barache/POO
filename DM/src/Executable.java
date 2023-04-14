import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

public class Executable {
    public static void main(String [] args){
        // Création des enclos
        Enclos enclos1=new Enclos("enclos des lions",50);
        Enclos enclos2=new Enclos("enclos des serpents",23);

        // Création des animaux
        Serpents serpent1=new Serpents("Kaa",30,true,false);
        Lions lion1=new Lions("Simba",55,true,false);
        Lions lion2=new Lions("Mufasa",120,false,true);


        // Ajout des animaux dans les enclos
        enclos1.ajouteAnimal(lion1);
        enclos1.ajouteAnimal(lion2);
        enclos2.ajouteAnimal(serpent1);


        // Création du zoo
        Zoo zoo=new Zoo("Beauval");
        zoo.ajouteEnclos(enclos1);
        zoo.ajouteEnclos(enclos2);
        zoo.accueillirAnimal(new Lions("Toto", 10, true, false), enclos1);
        System.out.println(zoo);




    }
}
