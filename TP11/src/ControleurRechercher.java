import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.control.Alert;
public class ControleurRechercher implements EventHandler<ActionEvent> {

    private Repertoire modele;
    private VueRepertoire vue;
    
    public ControleurRechercher(Repertoire modele, VueRepertoire vue){
        this.modele=modele;
        this.vue=vue;
    }
    
    @Override
    public void handle(ActionEvent actionEvent) {
        List<String> resultat;
        String numeroTel = this.vue.textFieldNumeroRecherche.getText();
        try{
            resultat = this.modele.rechercheNumero(numeroTel);
        }
        catch(PasDeContactException e){
            resultat=new ArrayList<>();
            Alert al = new Alert( Alert.AlertType.WARNING) ;
            al.setTitle ( "Avertissement" ) ;
            al.setHeaderText ( "Recherche infructueuse" ) ;
            al.setContentText ( "Désolé, nous n'avons pas trouvé de contact\nassocié au numéro de téléphone "+numeroTel+"\ndans le répertoire." ) ;
            al.showAndWait () ;
        }
        this.vue.majRecherche(resultat);

        }
}
