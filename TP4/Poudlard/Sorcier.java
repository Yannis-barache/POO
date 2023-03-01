public class Sorcier implements Comparable<Sorcier> {
    private String nom;
    private int courage;
    private int sagesse;
    
    public Sorcier(String nom, int courage, int sagesse){
        this.nom=nom;
        this.courage=courage;
        this.sagesse=sagesse;
    
    }

    public String getNom(){
        return this.nom;
    }

    public int getCourage(){
        return this.courage;
    }

    public int getSagesse(){
        return this.sagesse;
    }

    public boolean estCourageux(){
        if (this.courage>8){
            return true;
        }
        return false;
    }

    @Override

    public String toString (){
        return "("+this.nom +", "+this.courage+ ", " + this.sagesse+")";
    }

    @Override
    public int compareTo(Sorcier autreSorcier){
        return this.courage.compareTo(autreSorcier.courage);
    }
}
