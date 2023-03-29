public class PetitPoisson {
    
    private int posx;
    private int posy;
    private int vitesse;

    public PetitPoisson(int x, int y){
        this.posx = x;
        this.posy = y;
        this.vitesse = 2;
    }

    public Dessin getDessin(){
        Dessin dessin = new Dessin();
        String couleur = "0x0000F0";
        dessin.ajouteChaine(this.posx, this.posy, "><>", couleur);
        return dessin;
    }

    public void evolue(){
        this.posx+=vitesse;
    }
}
