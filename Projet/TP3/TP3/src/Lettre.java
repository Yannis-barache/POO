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
    public int toNumero(){
        int indice = (int) lettre ;
        if (indice == 32) {
            indice = 26;
        }
        else {
            indice = indice - 65;
        }

        return indice;
    }

    @Override
    public String toString(){
        return "Lettre : " + toChar() + " | Numéro : " + toNumero() + " | Morse : " + toMorse() ;
    }
    public String toMorse(){
        return alphabetMorse.get(toNumero());
    }
}
