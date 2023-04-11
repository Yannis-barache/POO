public class Serpents  extends Animaux{
    String nom;
    float poids;
    Enclos enclos;
    boolean blessure;
    boolean venimeux;


    public Serpents(String nom, float poids,boolean blessure,boolean venimeux){
        super(nom,poids,blessure);
        this.venimeux=venimeux;
    }

    public boolean getVenimeux(){
        return this.venimeux;
    }


    @Override
    public String toString(){
        if (this.venimeux) {
            return super.toString()+", est venimeux";
        }
        return super.toString()+", n'est pas venimeux";
    }


}
