import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ControleurAjouter implements EventHandler<ActionEvent> {

    private Repertoire modele;
    private VueRepertoire vue;
    
    public ControleurAjouter(Repertoire modele, VueRepertoire vue){
        this.modele=modele;
        this.vue=vue;
    }
    
    @Override
    public void handle(ActionEvent actionEvent) {
        this.modele.ajouteContact(this.vue.textFieldNom.getText(), this.vue.textFieldNumero.getText());
        this.vue.majAffichage(Repertoire.PAS_DE_TRI);
    }
}
