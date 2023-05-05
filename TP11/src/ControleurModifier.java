import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;

public class ControleurModifier implements EventHandler<ActionEvent> {

    private Repertoire modele;
    private VueRepertoire vue;
    
    public ControleurModifier(Repertoire modele, VueRepertoire vue){
        this.modele=modele;
        this.vue=vue;
    }
    
    @Override
    public void handle(ActionEvent actionEvent) {
        String nom = this.vue.textFieldNomModifie.getText();
	String nouveauNom = this.vue.textFieldNouveauNom.getText();
        try{
            this.modele.modifieContact(nom, nouveauNom);
            this.vue.majAffichage(Repertoire.PAS_DE_TRI);
        }
        catch(PasDeContactException e){
            Alert al = new Alert( Alert.AlertType.WARNING) ;
            al.setTitle ( "Avertissement" ) ;
            al.setHeaderText ( "Recherche infructueuse" ) ;
            al.setContentText ( "Désolé, nous n'avons pas trouvé de contact\ndont le nom est "+nom+"\ndans le répertoire." ) ;
            al.showAndWait () ;
        }
    }
}
