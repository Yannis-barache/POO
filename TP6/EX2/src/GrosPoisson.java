public class GrosPoisson {
    
    private int posx;
    private int posy;
    private int vitesse;

    public GrosPoisson(int x, int y){
        this.posx = x;
        this.posy = y;
        this.vitesse = 1;
    }

    public Dessin getDessin(){
        Dessin dessin = new Dessin();
        String couleur = "0x0000F0";
        dessin.ajouteChaine(this.posx, this.posy+3, "     ////;;;;;////", couleur);
        dessin.ajouteChaine(this.posx, this.posy+2, "  o :::::::;;////", couleur);
        dessin.ajouteChaine(this.posx, this.posy+1, "  >::::::::;;\\\\", couleur);
        dessin.ajouteChaine(this.posx, this.posy, "     ’’\\\\'''''\\", couleur);
        return dessin;
    }

    public void evolue(){
        this.posx+= vitesse;
    }
}