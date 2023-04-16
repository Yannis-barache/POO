import java.util.Comparator;

public class ComparateurNom implements Comparator<Animaux> {
    /** Compare deux animaux par leur nom
     * @param a1 le premier animal
     * @param a2 le second animal
     * @return 0 si les deux animaux ont le même nom, un nombre négatif si le nom de a1 est avant le nom de a2 dans l'ordre alphabétique, un nombre positif sinon
     */
    @Override
    public int compare(Animaux a1, Animaux a2) {
        return a1.getNom().compareTo(a2.getNom());
    }
}