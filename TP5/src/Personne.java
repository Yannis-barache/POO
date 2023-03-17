public class Personne {
    private String prenom;
    private int age;

    /** Créer une personne
     * @param prenom Un String qui représente le prénom de la personne
     * @param age Un int qui représente l'âge de la personne
     */

    public Personne(String prenom,int age){
        this.prenom=prenom;
        this.age=age;
    }

    /** Retourne le prénom de la personne
     * @return le prénom de la personne
     */
    public String getNom(){
        return this.prenom;
    }
    
}
