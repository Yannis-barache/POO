public class Lions extends Animaux{
    private boolean criniere;

    /**
     * @param nom le nom du lion
     * @param poids le poids du lion en kg
     * @param blessure true si le lion est blessé, false sinon
     * @param criniere true si le lion a une crinière, false sinon
     */
    public Lions(String nom, float poids,boolean blessure,boolean criniere){
        super(nom,poids,blessure);
        this.criniere=criniere;
    }

    /**
     * @return true si le lion a une crinière, false sinon
     */
    public boolean getCriniere(){
        return this.criniere;
    }

    /** Le lion rugit
     */
    public void son(){
        System.out.println(this.getNom()+" rugit");
    }



    /** Renvoie une description du lion
     * @return une description du lion
     */
    @Override
    public String toString(){
        if (this.criniere) {
            return super.toString()+", a une crinière";
        }
        return super.toString()+", n'a pas de crinière";
    }

    /** Compare deux lions pour savoir s'ils sont identiques
     * @param o l'objet à comparer
     * @return true si les lions sont identiques, false sinon
     */
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

    /** Renvoie un code de hachage pour le lion
     * @return un code de hachage pour le lion
     */
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
