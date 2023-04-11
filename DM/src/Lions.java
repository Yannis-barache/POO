public class Lions extends Animaux{
    private String nom;
    private float poids;
    private Enclos enclos;
    private boolean blessure;
    private boolean criniere;

    public Lions(String nom, float poids,boolean blessure,boolean criniere){
        super(nom,poids,blessure);
        this.criniere=criniere;
    }

    public boolean getCriniere(){
        return this.criniere;
    }

    @Override
    public String toString(){
        if (this.criniere) {
            return super.toString()+", a une crinière";
        }
        return super.toString()+", n'a pas de crinière";
    }

}
