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
        for (Lettre lettre : this.texte) {
            res += lettre.toString();
        }
        return res;
    }
    public String toMorse(){
        String res="";
        for (Lettre lettre : this.texte){
            res+= lettre.toMorse()+" ";
        }
        return res;
    }
    public boolean contient(Lettre lettre){
        return this.texte.contains(lettre);
    }

    public String decode(String morse){
        String res = "";
        for (String s : morse.split(" ")){
            res += new Lettre(s);
        }
        return res;
    }

    public void toSon() {
        Son son;
        for (Lettre lettre : this.texte) {
            son= new Son();
            lettre= new Lettre(lettre.toMorse());
            for (int i = 0; i < lettre.toMorse().length(); i++) {
                if (lettre.toMorse().charAt(i) == '=') {
                    son.tone(1000);
                    son.pause();
                }
                else {
                    son.tone(500);
                    son.pause();
                }
            }

        }

    }
}
