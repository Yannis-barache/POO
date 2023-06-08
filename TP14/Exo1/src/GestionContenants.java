
import java.util.List;
import java.util.ArrayList;

public class GestionContenants {

    private GestionContenants(){

    }

    public static <T> boolean contiennentTous(List<Contenant<T>> conts, T elem ){
        for (Contenant<T> contenant: conts){
            if (!contenant.contient(elem)){
                return false;
            }
        }
        return true;


    }
    
}
