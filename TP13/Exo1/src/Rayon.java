import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Rayon extends ArrayList<Article> implements Comptable{
    private String nom;


    public Rayon(String nom){
        super();
        this.nom=nom;
    }

    public String getNom(){
        return this.nom;
    }


    @Override
    public int combien(){
        return this.size();
    }


    public List<Article> trierParPrix(){
        List<Article> res = new ArrayList<>(this);
        Collections.sort(res);
        return res;
    }

    public Article quelArticle(String nom ) throws ArticleNonPresentException{
        for (Article a : this){
            if (a.getNom().equals(nom)) {
                return a;
            }
        }
        throw new ArticleNonPresentException();
    }


    class ArticleNonPresentException extends Exception{ 

    }

    
}
