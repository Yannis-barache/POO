import java.util.List;
import java.util.ArrayList;
public class Texte {
    private List<Lettre> texte;
    public Texte(String texte){
        this.texte = new ArrayList<>();
        for (int i = 0; i < texte.length(); i++) {
            this.texte.add(new Lettre(texte.charAt(i)));
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (Lettre lettre : texte) {
            res += lettre.toMorse();
        }
        return res;
    }
}
