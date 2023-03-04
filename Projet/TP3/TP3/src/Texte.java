import java.util.List;
import java.util.ArrayList;
public class Texte {
    private List<Lettre> texte;

    /** Créer une chaine de caractères à partir d'un String */
    public Texte(String texte){
        this.texte = new ArrayList<>();
        for (int i = 0; i < texte.length(); i++) {
            this.texte.add(new Lettre(texte.charAt(i)));
        }
    }

    /** Renvoie en une chaine de caractère le texte
     * @return La chaine en String*/
    @Override
    public String toString() {
        String res = "";
        for (Lettre lettre : this.texte) {
            res += lettre.toString();
        }
        return res;
    }

    /** Renvoie en une chaine de caractère le morse
     * @return Le morse en chaine*/
    public String toMorse(){
        String res="";
        for (Lettre lettre : this.texte){
            res+= lettre.toMorse()+" ";
        }
        return res;
    }

    /** Renvoie si la lettre est dans le texte
     * @param lettre : la lettre à chercher
     * @return true si la lettre est dans le texte, false sinon*/
    public boolean contient(Lettre lettre){
        return this.texte.contains(lettre);
    }


    /** Renvoie la traduction en texte du morse passé en paramètre
     * @param morse : le morse à convertir
     * @return Le texte en String*/
    public String decode(String morse){
        String res = "";
        for (String s : morse.split(" ")){
            res += new Lettre(s);
        }
        return res;
    }

    /** Joue le morse */
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


