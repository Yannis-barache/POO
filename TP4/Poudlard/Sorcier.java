import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Sorcier implements Comparable<Sorcier> {
    private String nom;
    private Integer courage;
    private int sagesse;

    /** Crée un sorcier avec un nom, une valeur de courage et une valeur de sagesse.
     *  @param nom Un String qui représente le nom
     *  @param courage Un int qui répresente le courage
     *  @param sagesse Un int qui représente sa sagesse*/
    public Sorcier(String nom, int courage, int sagesse){
        this.nom=nom;
        this.courage=courage;
        this.sagesse=sagesse;
    
    }
    /** Retourne le nom du sorcier
     *  @return Un String qui représente le nom du sorcier*/
    public String getNom(){
        return this.nom;
    }

    /** Retourne la valeur de courage du sorcier
     *  @return Un int qui représente la valeur de courage du sorcier*/
    public int getCourage(){
        return this.courage;
    }

    /** Retourne la valeur de sagesse du sorcier
     *  @return Un int qui représente la valeur de sagesse du sorcier*/
    public int getSagesse(){
        return this.sagesse;
    }

    /** Retourne true si le sorcier a une valeur de courage strictement supérieur à 8, false sinon
     *  @return Un boolean qui représente si le sorcier est courageux ou non*/
    public boolean estCourageux(){
        if (this.courage>8){
            return true;
        }
        return false;
    }

    /** Retourne une chaîne de caractères qui représente le sorcier
     *  @return Un String qui représente le sorcier*/
    @Override

    public String toString (){
        return "("+this.nom +", "+this.courage+ ", " + this.sagesse+")";
    }

    /** Compare deux sorciers en fonction de leur courage
     *  @param autreSorcier Un Sorcier qui représente le sorcier à comparer
     *  @return Un int qui représente le résultat de la comparaison*/
    @Override
    public int compareTo(Sorcier autreSorcier){
        return this.courage.compareTo(autreSorcier.courage);
    }

    /** Retourne true si deux sorciers ont le même nom, la même valeur de courage et la même valeur de sagesse, false sinon
     *  @param obj Un Object qui représente le sorcier à comparer
     *  @return Un boolean qui représente si les deux sorciers sont les mêmes ou non*/
    @Override
    public boolean equals(Object obj){
        if (obj==this){return true;}
        if (obj==null){return false;}
        if (obj instanceof Sorcier){
            Sorcier sorcier = (Sorcier) obj;
            return this.nom== sorcier.nom
                    && this.courage == sorcier.courage
                    && this.sagesse == sorcier.sagesse;
        }
        return false;

    }
}
