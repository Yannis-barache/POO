import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

class T9{
    private HashMap<String,Double> dicoFreq;
    private HashMap<String,String> prefixeMot;
    /**
      * @param mot
      * une chaine de caractère
      * @return une chaine de caractères correspondant à la suite de touches à taper pour obtenir le mot en entrée.
      *  Par exemple pour le mot 'toto', la fonction renvoie '8686'
      */
    public static String toTouches(String mot){
        String entree="";
        for (int i =0;i<mot.length();i++){
            char lettre = mot.charAt(i);
            boolean trouve= false;
            Integer numeroTouche=0;
            while (!trouve){
                if (getTexte(numeroTouche).contains(Character.toString(lettre))){
                    numeroTouche+=1;
                    entree+=numeroTouche.toString();
                    trouve=true;
                }
                numeroTouche+=1;
            }
        }
        return entree;
    }
    /**
     * Constructeur
     */
    T9()
    {
        dicoFreq= new HashMap<>();
        prefixeMot=new HashMap<>();
        try{
            Scanner in = new Scanner(new FileReader("./src/liste_mots.txt")).useLocale(Locale.US);
            while(in.hasNext()){
                String s=in.next();
                double d=in.nextDouble();
                if (!dicoFreq.containsKey(s)){
                    dicoFreq.put(s,d);
                }
                if (!prefixeMot.containsKey(s)){
                    prefixeMot.put(s,d);
                }

                System.out.println("le mot " + s + " a la valeur " + d);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Pas de fichier");
        }
        System.out.println(toTouches("aaah"));
    }
    /**
      * @param prefixe
      *     une chaine de caractères correspondant à une suite de touches tapées, par exemple "8686"
      * @return le mot le plus probable correspondant à la suite de touches.
      */
    public String getMot(String prefixe){
        // TODO : à concevoir
        return prefixe;
    }
    /**
      * @param numeroTouche un entier correspondant à la position de la touche sur le clavier (par exemple la touche '2' est à la position 1.)
      * @return le symbole qui doit être affiché sur la touche. Par exemple, sur l'entrée 1, le symbole est '2', sur l'entrée 9, le symbole est '*'
    */
    public String getSymbole(int numeroTouche){
        Integer numero=numeroTouche+1;
        if (numero==10){
            return "*";
        }
        if (numero ==11){
            return "0";
        }
        if (numero==12){
            return "#";
        }

        return numero.toString();
    }

    /**
      * @param numeroTouche
      *      un entier correspondant à la position de la touche sur le clavier (par exemple la touche '2' est à la position 1.)
      * @return les lettres qui correspondent à la touche. Par exemple, sur l'entrée 1, la fonction renvoie "abc" qui correpond au texte de la touche 2.
    */

    public static String getTexte(int numeroTouche){
        String liste_lettre= "- abc def ghi jkl mno pqrs tuv wxyz _ + _ ";
        String [] touche= liste_lettre.split(" ");
        return touche[numeroTouche];

    }




}
