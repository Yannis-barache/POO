import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.paint.Color;
import java.util.List;
import java.util.ArrayList;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import java.util.Collection;
import javafx.scene.layout.Border;

public class VueRepertoire extends Application {
    
    private Repertoire mesContacts;

    public TextField textFieldNom, textFieldNumero, textFieldNumeroRecherche, textFieldNomModifie, textFieldNouveauNom, textFieldNumeroSupprime, textFieldNomSupprime;;

        
    private VBox outputInformations, resultatRecherches;

            
    @Override 
    public void start(Stage stage) {
        
        this.mesContacts = new RepertoireMap();
        this.mesContacts.initRepertoire();
        this.textFieldNom = new TextField();
        this.textFieldNumero = new TextField();
        this.textFieldNumeroRecherche = new TextField();
        this.outputInformations = new VBox();
        this.resultatRecherches = new VBox();
	this.textFieldNomModifie = new TextField();
	this.textFieldNouveauNom = new TextField();
        this.textFieldNumeroSupprime = new TextField();
        this.textFieldNomSupprime  = new TextField();
        
        BorderPane root = new BorderPane();
        
        this.initLeft(root);
        this.initCenter(root);

        Scene scene = new Scene(root, 800, 500);  
        stage.setTitle("Mon répertoire téléphonique");
        stage.setScene(scene);
        stage.show();         
    }
    
    private void initLeft(BorderPane root){
        VBox vbox = new VBox();
        
        vbox.getChildren().add( this.boxAjouter());
        vbox.getChildren().add( this.boxRechercher());
	vbox.getChildren().add( this.boxModifier());
        vbox.getChildren().add( this.boxSupprimer());
	
                
        root.setLeft(vbox);
        vbox.setAlignment(Pos.TOP_CENTER);
    }       

    private void initCenter(BorderPane root){
        TitledPane centre = this.boxAfficher();
        root.setCenter(centre);
        root.setAlignment(centre, Pos.TOP_CENTER);
        
    }  
    
    private TitledPane boxAjouter(){
        GridPane boxAjouter = new GridPane();
        boxAjouter.setHgap(20);
        boxAjouter.add(new Label("Nom : "), 1,1);
        boxAjouter.add(this.textFieldNom, 2, 1);
        boxAjouter.add(new Label("Numero : "), 1, 2);
        boxAjouter.add(this.textFieldNumero, 2, 2);
        
        Button boutonValider = new Button("valider");
        boxAjouter.add(boutonValider,2,3);
        ControleurAjouter controleur = new ControleurAjouter(this.mesContacts, this);
        boutonValider.setOnAction(controleur);
        
        return new TitledPane("Ajouter un contact", boxAjouter);
    }

    private TitledPane boxRechercher(){
        
        VBox boxRechercher = new VBox(30);
        HBox boxnumero = new HBox();
        Button boutonValider = new Button("valider");
        boxnumero.getChildren().addAll(new Label("Numero recherché : "), this.textFieldNumeroRecherche, boutonValider);
        
        boxRechercher.getChildren().addAll(boxnumero, this.resultatRecherches);
        
        ControleurRechercher controleur = new ControleurRechercher(this.mesContacts, this);
        this.textFieldNumeroRecherche.setOnAction(controleur);
        boutonValider.setOnAction(controleur);
        
        return new TitledPane("Rechercher par numéro", boxRechercher);
    }
        
    private TitledPane boxAfficher(){
        
        VBox boxAfficher = new VBox(20);
        
        Button boutonTrierParNom = new Button("Trier par nom");
        Button boutonTrierParNumero = new Button("Trier par nombre de numéros");
        boxAfficher.getChildren().add(boutonTrierParNom);
        boxAfficher.getChildren().add(boutonTrierParNumero);
        boxAfficher.getChildren().add(this.outputInformations);
 
        ControleurTri controleur = new ControleurTri(this.mesContacts, this);
        boutonTrierParNom.setOnAction(controleur);       
        boutonTrierParNumero.setOnAction(controleur);   
         
        this.majAffichage(Repertoire.PAS_DE_TRI);
        TitledPane tp = new TitledPane("Liste de mes contacts", boxAfficher);
        tp.setCollapsible(false);
        return  tp;

    }
    private TitledPane boxModifier(){ // a été ajouter au sujet !!! 
        
        // VBox vbox = new VBox(10); aljyer du texte peut être ? 
        
        GridPane boxModifier = new GridPane();
        boxModifier.setHgap(20);
        boxModifier.add(new Label("Nom du contact à modifier : "), 1,1);
        boxModifier.add(this.textFieldNomModifie, 2, 1);
	boxModifier.add(new Label("Nouveau nom : "), 1, 2);
        boxModifier.add(this.textFieldNouveauNom, 2, 2);
        
        Button boutonValider = new Button("valider");
        boxModifier.add(boutonValider,2,3);
        ControleurModifier controleur = new ControleurModifier(this.mesContacts, this);
        boutonValider.setOnAction(controleur);
        
        return new TitledPane("Modifier un contact", boxModifier); // sur la boxModifier pour faire apparaître !!!
    }


    
    private TitledPane boxSupprimer(){
        
        VBox vbox = new VBox(10);
        
        GridPane boxSupprimer = new GridPane();
        boxSupprimer.setHgap(20);
        boxSupprimer.add(new Label("Nom du contact à supprimer : "), 1,1);
        boxSupprimer.add(this.textFieldNomSupprime, 2, 1);
        vbox.getChildren().addAll(boxSupprimer, new Label("Attention ! tous les numéros de ce contact seront supprimés"));
        
        Button boutonValider = new Button("valider");
        boxSupprimer.add(boutonValider,2,2);
        ControleurSupprimer controleur = new ControleurSupprimer(this.mesContacts, this);
        boutonValider.setOnAction(controleur);
        
        return new TitledPane("Supprimer un contact", vbox); //vbox ou boxSupprimer ? vbox car on veut le texte ajouté 
        
    }
        
     
    public void majAffichage(int typeDeTri){
        
        this.outputInformations.getChildren().clear();
        
        for (String nom : this.mesContacts.getNoms(typeDeTri)){
            VBox vbox = new VBox();
            TitledPane tp = new TitledPane(nom, vbox);
            tp.setExpanded(false);
            for (String numero : this.mesContacts.getNumeros(nom)){
                vbox.getChildren().add(new Label(numero));
            }            
            this.outputInformations.getChildren().add(tp);
        }
    }
    
    public void majRecherche(Collection<String> liste){
        

        this.resultatRecherches.getChildren().clear();
        
        for (String nom : liste){
            VBox vbox = new VBox();
            TitledPane tp = new TitledPane(nom, vbox);
            tp.setExpanded(false);
            for (String numero : this.mesContacts.getNumeros(nom)){
                vbox.getChildren().add(new Label(numero));
            }            
            this.resultatRecherches.getChildren().add(tp);
        }
    }
  
      
    public static void main(String args[]){ 
       launch(args); 
   } 
}       
