
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;

import javafx.scene.control.Label;

import javafx.scene.control.Button;

import javafx.event.EventHandler;

public class Telephone extends Application {
    Label ecran;
    Button[] touches;
    T9 t9;

    @Override
    public void init(){
      this.t9 = new T9();

    }

    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        ecran=new Label("Tapez votre mot");
        ecran.setMinHeight(50);
        border.setTop(ecran);
        GridPane clavierPane = new GridPane();
        border.setCenter(clavierPane);

        clavierPane.setHgap(5);
        clavierPane.setVgap(5);

        ToucheClavierHandler actionB = new ToucheClavierHandler(this);
        touches=new Touche[12];
        for(int ligne = 0; ligne <4; ligne++){
          for(int colonne = 0;colonne<3;colonne++)
          {
              Touche touche=new Touche(t9.getTexte(ligne*3 + colonne), t9.getSymbole(ligne*3 + colonne));
              clavierPane.add(touche, colonne, ligne);
              touche.setOnAction(actionB);
          }
        }
       Scene scene = new Scene(border, 300, 450);

       stage.setTitle("T9");
       stage.setScene(scene);
       stage.show();
   }

   public static void main(String args[]){
       launch(args);
   }

   public void affiche(String chaine){
     ecran.setText(chaine);
   }

   public void setPrefixe(String prefixe){
     affiche(t9.getMot(prefixe));
   }

   public void effacer(){
     affiche("");
   }

}
