public class Etudiant implements Comparable<Etudiant>{
    private String prenom;
    private String nom;
    private Integer telepathie;
    private Integer telekinesie;
    private Integer precognition;

    /**
     * Constructeur de Etudiant qui prend en paramètre le nom et le prénom de l'étudiant ainsi que ses scores de télékinésie, télépathie et précognition
     * @param nom Le nom de l'étudiant
     * @param prenom Le prénom de l'étudiant
     * @param telekinesie Le score de télékinésie de l'étudiant
     * @param telepathie Le score de télépathie de l'étudiant
     * @param precognition Le score de précognition de l'étudiant
     */
    public Etudiant(String nom,String prenom,Integer telekinesie, Integer telepathie, Integer precognition){
        this.prenom = prenom;
        this.nom = nom;
        this.telepathie = telepathie;
        this.telekinesie = telekinesie;
        this.precognition = precognition;
    }


    /**
     * Constructeur de Etudiant qui prend en paramètre le nom et le prénom de l'étudiant
     * @param nom Le nom de l'étudiant
     * @param prenom Le prénom de l'étudiant
     */
    public Etudiant(String prenom,String nom){
        this.prenom = prenom;
        this.nom = nom;
        this.telepathie = 0;
        this.telekinesie = 0;
        this.precognition = 0;
    }

    /**
     * Retourne le prénom de l'étudiant
     * @return Le prénom de l'étudiant
     */
    public String getPrenom(){
        return this.prenom;
    }

    /**
     * Retourne le nom de l'étudiant
     * @return Le nom de l'étudiant
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Retourne le score de télépathie de l'étudiant
     * @return Le score de télépathie de l'étudiant
     */
    public Integer getTelepathie(){
        return this.telepathie;
    }

    /**
     * Retourne le score de télékinésie de l'étudiant
     * @return Le score de télékinésie de l'étudiant
     */
    public Integer getTelekinesie(){
        return this.telekinesie;
    }

    /**
     * Retourne le score de précognition de l'étudiant
     * @return Le score de précognition de l'étudiant
     */
    public Integer getPrecognition(){
        return this.precognition;
    }

    /**
     * Modifie le score de télépathie de l'étudiant
     * @param telepathie Le nouveau score de télépathie de l'étudiant
     */
    public void setTelepathie(Integer telepathie){
        this.telepathie = telepathie;
    }

    /**
     * Modifie le score de télékinésie de l'étudiant
     * @param telekinesie Le nouveau score de télékinésie de l'étudiant
     */
    public void setTelekinesie(Integer telekinesie){
        this.telekinesie = telekinesie;
    }

    /**
     * Modifie le score de précognition de l'étudiant
     * @param precognition Le nouveau score de précognition de l'étudiant
     */
    public void setPrecognition(Integer precognition){
        this.precognition = precognition;
    }

    /**
     * Retourne une chaîne de caractères contenant le prénom et le nom de l'étudiant ainsi que ses scores de télépathie, télékinésie et précognition
     * @return
     */
    @Override
    public String toString(){
        if (this.telepathie == 0 || this.telekinesie == 0 || this.precognition == 0){
            return this.prenom+" "+this.nom+" - Il manque des notes";   
        }
        return this.prenom + " " +this.nom+" - Notes :  telepathie = " + this.telepathie + ", precognition = " + this.precognition + ", telekinesie = " + this.telekinesie; }


    /**
     * Retourne true si l'objet passé en paramètre est égal à l'étudiant
     * @param o L'objet à comparer
     * @return true si l'objet passé en paramètre est égal à l'étudiant, false sinon
     */
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

    /**
     * Retourne le hashcode de l'étudiant
     * @return Le hashcode de l'étudiant
     */
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

    /**
     * Compare l'étudiant avec l'étudiant passé en paramètre
     * @param e L'étudiant à comparer
     * @return 1 si l'étudiant passé en paramètre a un score de télépathie supérieur à l'étudiant, -1 si l'étudiant passé en paramètre a un score de télépathie inférieur à l'étudiant, 0 sinon
     */
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