import java.util.Comparator;
import java.util.List;

public class ComparateurNbNum implements Comparator<List<String>>{
    
    @Override
    public int compare (List<String> liste1, List<String> liste2){
        return liste1.size()- liste2.size();

    }
    
}
