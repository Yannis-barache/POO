import java.util.Arrays;
import java.util.List;

public class Lettre{

    private char lettre;
    private static List<String> alphabetMorse = Arrays.asList("=_===",
            "===_=_=_=", "===_=_===_=", "===_=_=", "=", "=_=_===_=",
            "===_===_=", "=_=_=_=", "=_=", "=_===_===_===", "===_=_===",
            "=_===_=_=", "===_===", "===_=", "===_===_===", "=_===_===_=",
            "===_===_=_===", "=_===_=", "=_=_=", "===", "=_=_===",
            "=_=_=_===", "=_===_===", "===_=_=_===", "===_=_===_===",
            "===_===_=_=", "_");
    /**
     * Construit une lettre de la classe Lettre à partir d'un caractère
     * @param lettre : la lettre à convertir
     */
    public Lettre(char lettre) {
        this.lettre = lettre;
    }
    /**
     * Construit une lettre de la classe Lettre à partir d'une chaine de caractère
     * @param morse : la chaine de caractère à convertir
     */
    public Lettre(String morse){
        int indice = alphabetMorse.indexOf(morse);
        this.lettre = (char) (indice + 65) ;

    }
    public char toChar(){
        return (char) lettre;
    }

    /**
     * Renvoie le numéro de la lettre dans l'alphabet
     * @return le numéro de la lettre dans l'alphabet
     */
    public int toNumero(){
        int indice = (int) lettre ;
        if (indice == 32) {
            indice = 26;
        }
        else {
            indice -= 65;
        }

        return indice;
    }

    /**
     * Renvoie la lettre en String
     * @return la lettre en String
     */
    @Override
    public String toString(){
        return toChar()+"" ;
    }

    /**
     * Renvoie la lettre en morse
     * @return la lettre en morse
     */
    public String toMorse(){
        return alphabetMorse.get(toNumero());
    }

    /** Renvoie si la lettre est dans le texte
     * @param obj : l'objet avec lequel on compare
     * @return true si l'objet en paramètre est égal, false sinon*/
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Lettre){
            Lettre l = (Lettre) obj;
            return this.lettre == l.lettre;
        }
        return false;
    }
}

