import java.lang.Comparable;

public class Article implements Comparable<Article>{
    private String nom;
    private Double prix;
    private Double poids;

    public Article(String nom,Double prix,Double poids ){
        this.nom=nom;
        this.prix=prix;
        this.poids=poids;
    }

    public String getNom(){
        return this.nom;
    }

    public Double getPrix(){
        return this.prix;
    }

    public Double getPoids(){
        return this.poids;
    }

    @Override
    public String toString(){
        return "Article : "+this.nom+" Prix : "+this.prix+" Poids : "+this.poids;
    }

    @Override
    public boolean equals(Object o){
        if (o==this) return true;
        if (o==null) return false;
        if(o instanceof Article){
            Article a = (Article) o;
            return this.nom.equals(a.getNom()) && this.prix==a.getPrix() && this.poids==a.getPoids();
        }
        return false;
    }

    @Override
    public int hashCode(){
        int res=0;
        for (int i=0;i<this.nom.length();i++){
            res+=this.nom.charAt(i)*Math.pow(31,i);
        }
        return res + this.prix.intValue() + this.poids.intValue();
    }

    @Override
    public int compareTo(Article a){
        if (this.prix<a.getPrix()) return -1;
        if (this.prix>a.getPrix()) return 1;
        return 0;
    }


    
}
