public class Champion {
    private String nom;
    private int pointsDeVie;
    private int attaque;
    private int soin;
    public Champion(String nom, int pointsDeVie, int attaque, int soin) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
        this.soin = soin;
    }
    public String getNom() {
        return nom;
    }
    public void combat(Champion adversaire) {
        adversaire.pointsDeVie -= this.attaque;
        this.pointsDeVie -= adversaire.attaque;
    }
    public void boitUnePotionDeSoin() {
        this.pointsDeVie += 5;
    }

    public boolean estEnVie() {
        return this.pointsDeVie > 0;
    }

    @Override
    public String toString(){
        return this.nom + " : pv=" + this.pointsDeVie + ", attaque=" + this.attaque + ", soin=" + this.soin;
    }

    public void soigne(Champion championBlesse) {
        championBlesse.pointsDeVie += this.soin;
    }
    public int getPointsDeVie() {
        return this.pointsDeVie;
    }

}
