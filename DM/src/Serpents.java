public class Serpents  extends Animaux{
    private boolean venimeux;

    /**
     * @param nom le nom du serpent
     * @param poids le poids du serpent
     * @param blessure si le serpent est blessé ou non
     * @param venimeux si le serpent est venimeux ou non
     */
    public Serpents(String nom, float poids,boolean blessure,boolean venimeux){
        super(nom,poids,blessure);
        this.venimeux=venimeux;
    }

    /** Retourne si le serpent est venimeux ou non
     * @return true si le serpent est venimeux, false sinon
     */
    public boolean getVenimeux(){
        return this.venimeux;
    }

    /** Le serpent siffle
     */
    public void son(){
        System.out.println(this.getNom()+" siffle");
    }


    /** Retourne une chaîne de caractères décrivant le serpent
     * @return une chaîne de caractères décrivant le serpent
     */
    @Override
    public String toString(){
        if (this.venimeux) {
            return super.toString()+", est venimeux";
        }
        return super.toString()+", n'est pas venimeux";
    }

    /** Retourne si le serpent est égal à un autre serpent
     * @param o l'objet à comparer
     * @return true si le serpent est égal à l'objet, false sinon
     */
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

    /** Retourne le hashcode du serpent
     * @return le hashcode du serpent
     */
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
