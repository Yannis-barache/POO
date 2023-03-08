import java.time.Period;

public class Executable{
    public static void main(String[] args){
    // Gimli a une barbe de 65cm et des oreilles de 15 cm
    Personnage gimli= new Personnage("Gimli",65,15);
    System.out.println(gimli);
    Personnage legolas = new Personnage("Legolas",0,35);
    Personnage grandpas = new Personnage("Aragorn",20,8);
    Groupe fraternite = new Groupe("La Fraternité");
    fraternite.ajoute(gimli);
    fraternite.ajoute(new Personnage("legolas",0,35));
    fraternite.ajoute("Frodo",1,25);
    fraternite.ajoute("Sam",2,24);
    fraternite.ajoute("Boromir",15,9);
    fraternite.ajoute("Aragorn",20,8);
    fraternite.ajoute("Merry",7,26);
    fraternite.ajoute("Pippin",4,25);
    System.out.println(fraternite);
    // La fraternite [(Gimli , b=65, o=15) ...]
    List<Personnage> grandeOreilles = fraternite.filtreOreille(25);
    System.out.println("Les grandes oreilles : "+grandeOreilles);
    List<Personnage> petiteBarbe= fraternite.filtreBarbe(10);
    
    }
}