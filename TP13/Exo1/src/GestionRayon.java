import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionRayon {

    private GestionRayon(){

    }

    public static double moyenneDesPrix(Rayon rayon) throws NullPointerException{
        if (rayon.combien()==0){
            throw new NullPointerException();
        }

        double res=0;
        for (Article article:rayon){
            res+= article.getPrix();
        }
        return res/rayon.combien();

    }

    public static List<Article> trierParNom(Rayon rayon) throws NullPointerException{
        if (rayon.size()==0){
            throw new NullPointerException();
        }
        List<Article> res= new ArrayList<>(rayon);
        Collections.sort(res, new ComparateurNomArticle());


        return res;
    }
    
}
