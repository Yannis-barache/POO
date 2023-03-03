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
        String partie;
        for (Lettre lettre : this.texte) {
            son = new Son();

            lettre = new Lettre(lettre.toMorse());
            int ajout = 0;
            for (int i=0 ; i<lettre.toMorse().length(); i++){
                if (lettre.toMorse().charAt(i)== '_'){
                    son.pause();

                }
                if (lettre.toMorse().charAt(i)=='=') {
                    if (i + 1 >= lettre.toMorse().length()) {
                        son.tone(100);

                    } else {
                        if (lettre.toMorse().charAt(i + 1) == '=') {
                            son.tone(300);
                            i += 2;
                        } else {
                            son.tone(100);

                        }
                    }
                }




            }

        }

    }
}


