public class Lions extends Animaux{
    private boolean criniere;

    public Lions(String nom, float poids,boolean blessure,boolean criniere){
        super(nom,poids,blessure);
        this.criniere=criniere;
    }

    public boolean getCriniere(){
        return this.criniere;
    }

    public void son(){
        System.out.println(this.getNom()+" rugit");
    }



    @Override
    public String toString(){
        if (this.criniere) {
            return super.toString()+", a une crinière";
        }
        return super.toString()+", n'a pas de crinière";
    }

    @Override
    public boolean equals(Object o){
        if (o==null) {
            return false;
        }
        if (o==this) {
            return true;
        }

        if (o instanceof Lions) {
            Lions lion=(Lions)o;
            return this.getNom().equals(lion.getNom()) && this.getPoids()==lion.getPoids()
                    && this.getBlessure()==lion.getBlessure() && this.criniere==lion.getCriniere();
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 23;
        for (int i = 0; i < this.getNom().length(); i++) {
            hash = hash*57 + this.getNom().charAt(i);
        }
        hash = hash+ (int) this.getPoids();
        if (this.getBlessure()) {
            hash = hash*2;
        }
        if (this.criniere) {
            hash = hash+93;
        }
        return hash;

    }

}
