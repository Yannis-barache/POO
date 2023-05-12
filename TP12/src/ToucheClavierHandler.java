import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ToucheClavierHandler implements EventHandler<ActionEvent>  {
    // Lien vers la calculette pour pouvoir modifier certaines de ses propriétés
    Telephone c;
    String prefixe;
    /**
     * Constructeur
     */
    public ToucheClavierHandler(Telephone c) {
        prefixe ="";
        this.c=c;
    }
    @Override
        public void handle(ActionEvent arg0) {
            String symbole = ((Touche)(arg0.getSource())).getSymbole();
            if(symbole.equals( "*")){
                prefixe="";
                c.effacer();
            }
            else{
                prefixe=prefixe+symbole;
            }
            c.setPrefixe(prefixe);
        }
}
