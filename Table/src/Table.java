import java.util.List;
import java.util.ArrayList; // importation de la classe ArrayList
public class Table {
    private List<Personne> lesConvives;
    public Table() {
        lesConvives = new ArrayList<Personne>();
    }
    public void ajouteConvive(String nom, int age) {
        lesConvives.add(new Personne(nom, age));
    }
    public double moyenneAge() {
        double somme = 0;
        for (Personne p : lesConvives) {
            somme += p.getAge();
        }
        return somme / lesConvives.size();
    }
    public int nombreDAdultes() {
        int nb = 0;
        for (Personne p : lesConvives) {
            if (p.getAge() >= 18) {
                nb++;
            }
        }
        return nb;
    }
    public Personne lePlusJeune() {
        Personne p = lesConvives.get(0);
        for (Personne p2 : lesConvives) {
            if (p2.getAge() < p.getAge()) {
                p = p2;
            }
        }
        return p;
    }
    public boolean sontACote(String nom1, String nom2) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < lesConvives.size(); i++) {
            if (lesConvives.get(i).getNom().equals(nom1)) {
                i1 = i;
            }
            if (lesConvives.get(i).getNom().equals(nom2)) {
                i2 = i;
            }
        }
        return Math.abs(i1 - i2) == 1;
    }
    public void echange(String nom1, String nom2) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < lesConvives.size(); i++) {
            if (lesConvives.get(i).getNom().equals(nom1)) {
                i1 = i;
            }
            if (lesConvives.get(i).getNom().equals(nom2)) {
                i2 = i;
            }
        }
        Personne p1 = lesConvives.get(i1);
        lesConvives.set(i1, lesConvives.get(i2));
        lesConvives.set(i2, p1);
    }
}
