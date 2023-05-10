import javafx.scene.shape.Circle;
import java.lang.Math;
import javafx.scene.paint.Color;
import java.util.List;
import java.util.ArrayList;


public class Cercle extends Circle{
    private static double RAYON_MINI=1.0;


    public Cercle(double largeur,double hauteur){
        super(Math.random()*largeur,Math.random()*hauteur,RAYON_MINI);
        this.setFill(new Color(Math.random(),Math.random(),Math.random(),1.0));
    }

    private boolean intersecte(Cercle c){
        return Math.sqrt(Math.pow(c.getCenterX()-this.getCenterX(),2)+Math.pow(c.getCenterY()-this.getCenterY(),2))<c.getRadius()+this.getRadius();

    }

    private boolean estDansLeCadre(double largeur,double hauteur){
        return this.getCenterX()+this.getRadius()< largeur && this.getCenterY()+ this.getRadius()<hauteur;
    }

    private boolean estValide(List<Cercle> liste,double largeur,double hauteur){
        for (Cercle cercle: liste){
            if(this.intersecte(cercle) || !this.estDansLeCadre(largeur, hauteur)){
                return false;
            }
        }
        return true;
    }

    private void placerAuHasard(List<Cercle> liste,double largeur ,double hauteur){
        while (!this.estValide(liste, largeur, hauteur) || !this.estDansLeCadre(largeur, hauteur)){
            this.setCenterX(Math.random()*largeur);
            this.setCenterY(Math.random()*hauteur);
        }

    }

    public Cercle(List<Cercle> liste, double largeur, double hauteur){
        super(Math.random()*largeur,Math.random()*hauteur,RAYON_MINI);
        this.placerAuHasard(liste, largeur, hauteur);    
    }

    public void grossir(List<Cercle> liste,double largeur,double hauteur){
        while (this.estValide(liste, largeur, hauteur)){
            this.setRadius(this.getRadius()+RAYON_MINI);
        }
    }




    



}