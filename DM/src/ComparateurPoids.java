import java.util.Comparator;

public class ComparateurPoids implements Comparator<Animaux> {

    /** Compare deux animaux par leur poids
     * @param a1 le premier animal
     * @param a2 le second animal
     * @return 0 si les deux animaux ont le même poids, un nombre négatif si le poids de a1 est plus petit que le poids de a2, un nombre positif sinon
     */
    @Override
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