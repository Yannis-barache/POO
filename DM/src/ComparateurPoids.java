import java.util.Comparator;

public class ComparateurPoids implements Comparator<Animaux> {
    public int compare(Animaux a1, Animaux a2) {
        if (a1.getPoids() > a2.getPoids()) {
            return 1;
        } else if (a1.getPoids() < a2.getPoids()) {
            return -1;
        } else {
            return 0;
        }
    }
}