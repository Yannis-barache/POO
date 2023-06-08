
public class Diamant implements Cadeau{

    private int poids;

    public Diamant(int poids){
        this.poids=poids;
    }

    @Override
    public int getPoids(){
        return this.poids;
    }


    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Diamant){
            Diamant d = (Diamant) obj;
            return this.poids == d.poids;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Diamant de poids " + this.poids;
    }

    @Override
    public int hashCode(){
        return this.poids*17+29;
    }

    
}
