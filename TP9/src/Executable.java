import java.util.ArrayList;
import java.util.List;

public class Executable{
    public static void main(String [] args){
        // Test de la classe Personne
        Personne p1 = new Personne("Doe", "John", 25);
        Personne p2 = new Personne("Doe", "Jane", 30);
        Personne p3 = new Personne("Doe", "Jack", 20);
        Personne p4 = new Personne("Doe", "Jill", 35);
        Personne p5 = new Personne("Doe", "Jill", 33);
        Personne p6 = new Personne("Do", "Karim", 15);
        List<Personne> personnes = new ArrayList<Personne>();
        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p3);
        personnes.add(p4);
        personnes.add(p5);
        personnes.add(p6);
        System.out.println("Avant le tri:");
        System.out.println(personnes);
        System.out.println("Après le tri:");
        System.out.println(BibPersonne.trierParAge(personnes));
        System.out.println("Ecart d'âge minimum:");
        System.out.println(BibPersonne.ecartMin(personnes));
        System.out.println("-------------------------------------------");
        // Test de la classe Complexe
        Complexe c1 = new Complexe(1, 2);
        Complexe c2 = new Complexe(10, 3);
        Complexe c3 = new Complexe(300, 4);
        Complexe c4 = new Complexe(41, 5);
        Complexe c5 = new Complexe(58, 6);
        Complexe c6 = new Complexe(61, 7);
        List<Complexe> complexes = new ArrayList<Complexe>();
        complexes.add(c1);
        complexes.add(c2);
        complexes.add(c3);
        complexes.add(c4);
        complexes.add(c5);
        complexes.add(c6);
        System.out.println("Avant le tri:");
        System.out.println(complexes);
        System.out.println("Après le tri:");
        System.out.println(BibComplexe.trier(complexes, new ComparateurComplexe()));
        System.out.println(BibComplexe.trier(complexes, new ComparateurComplexeNorme()));

    }
    
}
