import java.util.Comparator;

public class ComparateurNomArticle implements Comparator<Article>{
    public ComparateurNomArticle(){

    }

    @Override
    public int compare(Article a1,Article a2){
        return a1.getNom().compareTo(a2.getNom());
    }
    
}
