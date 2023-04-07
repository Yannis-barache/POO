public class Personne {
    private String nom;
    private String prenom;
    private int age;

    /** Construit une personne avec un nom, un prenom et un age
     * @param nom le nom de la personne
     * @param prenom le prenom de la personne
     * @param age l'age de la personne
     */
    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /** Renvoie le nom de la personne
     * @return le nom de la personne
     */
    public String getNom(){
        return this.nom;
    }

    /** Renvoie le prenom de la personne
     * @return le prenom de la personne
     */
    public String getPrenom(){
        return this.prenom;
    }

    /** Renvoie l'age de la personne
     * @return l'age de la personne
     */
    public int getAge(){
        return this.age;
    }

    

    /** Renvoie la personne en une chaine de caractère
     * @return la personne en une chaine de caractère
     */
    @Override
    public String toString(){
        return this.nom + " " + this.prenom + " " + this.age;
    } 
    
}
