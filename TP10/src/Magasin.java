import java.lang.management.ThreadInfo;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

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
        return "("+this.getNom() + ", "+this.ouvertLundi+", "+ this.ouvertDimanche+")";
    }

    @Override
    public boolean equals(Object o){
        if(o==null){ return false;}
        if (o==this){ return true;}
        if(o instanceof Magasin){
            Magasin mag= (Magasin) o;
            return this.nom==mag.nom && this.ouvertDimanche==mag.ouvertDimanche && this.ouvertLundi== mag.ouvertLundi;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int nom=0;
        for (int i=0;i<this.nom.length();i++){
            nom+=this.nom.charAt(i)*i;
        }
        int bool=0;
        if (this.ouvertDimanche && this.ouvertLundi){
            bool=321;
        }else if(this.ouvertDimanche && !this.ouvertLundi){
            bool=41;
        }
        return 78*31+45*bool+nom;
    }


}