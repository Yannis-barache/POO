import java.util.Arrays;

public class Executable {
    public static void main(String[] agrs){
        Article pomme= new Article("Pomme", 1.5, 0.2);
        Article poire= new Article("Poire", 1.2, 0.3);
        Article banane= new Article("Banane", 1.0, 0.1);

        Rayon r = new Rayon("Fruits");
        r.add(pomme);
        r.add(poire);
        r.add(banane);


        Rayon r2 = new Rayon("Legumes");
        r2.add(new Article("Carotte", 1.5, 0.2));
        r2.add(new Article("Poireau", 1.2, 0.3));
        


        Article a = new Article("Pomme", 1.5, 0.2);
        assert a.getPrix()==1.5;
        assert a.getPoids()==0.2;
        assert a.getNom().equals("Pomme");
        assert !a.getNom().equals("Citron tres long");
        assert r.combien()==3;
        assert r2.combien()==2;
        try{
            r.quelArticle("Pomme");

        }catch(Rayon.ArticleNonPresentException e){
            System.out.println("Article non present");
        }

        try{
            r.quelArticle("Citron");
        }catch(Rayon.ArticleNonPresentException e){
            System.out.println("Article non present (c'est normal)");
        }

        assert r.trierParPrix().equals(Arrays.asList(banane, poire,pomme));
        assert GestionRayon.trierParNom(r).equals(Arrays.asList(banane, poire,pomme));
        




    }
    
}
