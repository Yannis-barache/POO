import java.util.Comparator;

public class ComparateurNom implements Comparator<Animaux> {
    public int compare(Animaux a1, Animaux a2) {
        return a1.getNom().compareTo(a2.getNom());
    }
}