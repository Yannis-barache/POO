public class Etudiant implements Comparable<Etudiant>{
    private String prenom;
    private String nom;
    private int telepathie;
    private int telekinesie;
    private int precognition;

    public Etudiant(String nom,String prenom,int telekinesie, int telepathie, int precognition){
        this.prenom = prenom;
        this.nom = nom;
        this.telepathie = telepathie;
        this.telekinesie = telekinesie;
        this.precognition = precognition;
    }


    public Etudiant(String prenom,String nom){
        this.prenom = prenom;
        this.nom = nom;
        this.telepathie = 0;
        this.telekinesie = 0;
        this.precognition = 0;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public int getTelepathie(){
        return this.telepathie;
    }

    public int getTelekinesie(){
        return this.telekinesie;
    }

    public int getPrecognition(){
        return this.precognition;
    }

    public void setTelepathie(int telepathie){
        this.telepathie = telepathie;
    }

    public void setTelekinesie(int telekinesie){
        this.telekinesie = telekinesie;
    }

    public void setPrecognition(int precognition){
        this.precognition = precognition;
    }

    @Override
    public String toString(){
        if (this.telepathie == 0 || this.telekinesie == 0 || this.precognition == 0){
            return this.prenom+" "+this.nom+" - Il manque des notes";   
        }
        return this.prenom + " " +this.nom+" - Notes :  telepathie = " + this.telepathie + ", precognition = " + this.precognition + ", telekinesie = " + this.telekinesie; }

    @Override
    public boolean equals(Object o){
        if (o == null){
            return false;
        }
        if (o == this){
            return true;
        }
        if (o instanceof Etudiant){
            Etudiant e = (Etudiant) o;
            return this.prenom.equals(e.prenom) && this.nom.equals(e.nom) && this.telepathie == e.telepathie && 
            this.telekinesie == e.telekinesie && this.precognition == e.precognition;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int res=0;
        for (int i=0;i<this.prenom.length();i++){
            res += this.prenom.charAt(i);
        }

        for (int i=0;i<this.nom.length();i++){
            res += this.nom.charAt(i);
        }

        return res+this.telepathie*11+this.telekinesie*27+this.precognition*77;
    }

    @Override
    public int compareTo(Etudiant e){
        if (e.getTelepathie()> this.telepathie){
            return 1;
        }
        if (e.getTelepathie() < this.telepathie){
            return -1;
        }
        return 0;
    }
}