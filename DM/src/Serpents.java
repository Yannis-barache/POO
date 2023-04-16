public class Serpents  extends Animaux{
    private boolean venimeux;


    public Serpents(String nom, float poids,boolean blessure,boolean venimeux){
        super(nom,poids,blessure);
        this.venimeux=venimeux;
    }

    public boolean getVenimeux(){
        return this.venimeux;
    }

    public void son(){
        System.out.println(this.getNom()+" siffle");
    }


    @Override
    public String toString(){
        if (this.venimeux) {
            return super.toString()+", est venimeux";
        }
        return super.toString()+", n'est pas venimeux";
    }

    @Override
    public boolean equals(Object o){
        if (o==null) {
            return false;
        }
        if (o==this) {
            return true;
        }

        if (o instanceof Serpents) {
            Serpents serpent=(Serpents)o;
            return this.getNom().equals(serpent.getNom()) && this.getPoids()==serpent.getPoids()
                    && this.getBlessure()==serpent.getBlessure() && this.venimeux==serpent.getVenimeux();
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        for (int i = 0; i < this.getNom().length(); i++) {
            hash = hash*31 + this.getNom().charAt(i);
        }
        hash = hash+ (int) this.getPoids();
        if (this.getBlessure()) {
            hash = hash+1;
        }
        if (this.venimeux) {
            hash = hash+1;
        }
        return hash;

    }


}
