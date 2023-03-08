import java.util.List;
import java.util.Collections;
import java.util.Arrays;
public class Executable {
    public static void main(String[] args){
        List <Pokemon>liste=Arrays.asList(
        new Pokemon (" HYDRAGON " , 14), new Pokemon ( " Meltan " , 8) ,
        new Pokemon ( " Brindibou " , 11), new Pokemon ( " Griknot " , 14) ,
        new Pokemon ( " CHARCOR " , 2), new Pokemon ( " Paras " , 7) );
        System.out.println(Collections.min(liste)) ; // ICI
    }
}
    

