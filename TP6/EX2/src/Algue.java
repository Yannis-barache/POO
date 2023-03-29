import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Algue {
    private double posX;
    private List<String> feuilles;

    public Algue(double posX) {
        this.posX=posX;
        this.feuilles=new ArrayList<>();
        Random random= new Random();
        for (int i=0; i< random.nextInt(14);i++){
            if (i%2==0){
                this.feuilles.add("(");
            }
            else {
                this.feuilles.add(")");
            }

        }

    }

    public Dessin getDessin(){
        Dessin dessin = new Dessin();
        String couleur = "0x0000F0";
        for (int i=0;i<4;i++){
            if (i%2==0){
                dessin.ajouteChaine( (int) this.posX,i, "(", couleur);
            }
            else {
                dessin.ajouteChaine((int) this.posX, i, ")", couleur);
            }
        }
        return dessin;
    }

    public void ondule(){
        for (String feuille : this.feuilles){
            if (feuille==")"){
                feuille="(";
            }
            else {feuille=")";}
        }
    
    }

    
}
