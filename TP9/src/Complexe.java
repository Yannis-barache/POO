import java.lang.Math;

public class Complexe {

    private double reel;
    private double imaginaire;

    /** Construit un complexe avec un reel et un imaginaire
     * @param reel le reel du complexe
     * @param imaginaire l'imaginaire du complexe
     */
    public Complexe(double reel, double imaginaire){
        this.reel = reel;
        this.imaginaire = imaginaire;
    }
    /** Renvoie la partie reel du nombre complexe
     * @return la partie reel du nombre complexe
     */
    public double getReel(){
        return this.reel;
    }

    /** Renvoie la partie imaginaire du nombre complexe
     * @return la partie imaginaire du nombre complexe
     */
    public double getImaginaire(){
        return this.imaginaire;
    }

    /** Renvoie la norme du nombre complexe
     * @return la norme du nombre complexe
     */
    public double getNorme(){
        return Math.pow(this.reel,2) + Math.pow(this.imaginaire,2);
    }

    /** Renvoie le nombre complexe en une chaine de caractère
     * @return le nombre complexe en une chaine de caractère
     */
    @Override
    public String toString(){
        return this.reel + "+" + this.imaginaire + "i";
    }

    

}