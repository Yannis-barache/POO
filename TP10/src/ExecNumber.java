import java.util.ArrayList;
import java.util.List;

public class ExecNumber{
    public static void main(String [] args){
        List<Number> tableau = new ArrayList<>();
        tableau.add(5);
        tableau.add(6.);
        tableau.add(7.f);
        Number number = 8.5f;
        tableau.add(number);
        Integer x= 5;
        Double y= 5.0;
        System.out.println(x.equals(y));

        System.out.println(tableau);
    }
}
