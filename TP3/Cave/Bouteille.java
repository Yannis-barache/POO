public class Bouteille {
    private String region;
    private String appelation;
    private int millesime;
    
    public Bouteille(String region , String appelation , int millesime){
        this.region=region;
        this.appelation=appelation;
        this.millesime=millesime;    
    }
    public
    
    @Override
    public boolean equals (Object obj){
        if (obj == this) ( return true;)
        if (obj == null) (return false;)
        if (obj instanceof Bouteille){
            Bouteille b = (Bouteille) obj;
            return b.getAppellation().equals(this.getAppellation())
            && b.getRegion().equals(this.getRegion())
            && b.getMillesime() == this.getMillesime();
        
        }
    return true;
    }

}
