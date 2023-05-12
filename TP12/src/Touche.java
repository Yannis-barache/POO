import javafx.scene.control.Button;
import javafx.scene.text.TextAlignment;

public class Touche extends Button{

  String symbole;
  public Touche(String texte, String symbole){
    super(texte + "\n" + symbole);
    this.symbole = symbole;
    this.setMinWidth(95);
    this.setMinHeight(95);
    this.textAlignmentProperty().set(TextAlignment.CENTER);
  }

  public String getSymbole(){
    return this.symbole;
  }

}
