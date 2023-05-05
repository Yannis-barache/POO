import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ControleurTri implements EventHandler<ActionEvent> {

    Repertoire modele=null;
    VueRepertoire vue = null;
    
    public ControleurTri(Repertoire modele, VueRepertoire vue){
        this.modele=modele;
        this.vue=vue;
    }
    
    @Override
    public void handle(ActionEvent actionEvent) {
        Button b= (Button) actionEvent.getSource();
        if (b.getText().endsWith("nom")) {
            this.vue.majAffichage(Repertoire.TRI_PAR_ORDRE_ALPHABETIQUE);
        }
        else if  (b.getText().contains("numéro")) {
             this.vue.majAffichage(Repertoire.TRI_PAR_NOMBRE_DE_NUMERO);
        }

    }
}
