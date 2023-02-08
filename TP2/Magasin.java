import java.lang.management.ThreadInfo;

public class Magasin {
    private String nom;
    private boolean ouvertLundi, ouvertDimanche;

    public Magasin( String nom,boolean ouvertLundi,boolean ouvertDimanche){
        this.nom= nom;
        this.ouvertLundi= ouvertLundi;
        this.ouvertDimanche=ouvertDimanche;

    }
    public String getNom(){
        return this.nom;

    }
    public boolean ouvertLundi(){
        return this.ouvertLundi;
    }
    public boolean ouvertDimanche(){
        return this.ouvertDimanche;
    }
    @Override
    public String toString(){
        return this.getNom() + " "+this.ouvertLundi+" "+ this.ouvertDimanche;
    }


}