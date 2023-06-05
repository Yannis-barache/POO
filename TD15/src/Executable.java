public class Executable {
    public static void main(String[] args){
        Simple toto= new Simple<String>("toto");
        Simple integ=new Simple<Integer>(12);
        Simple doub= new Simple<Double>(5.5);
        System.out.println(toto.getElem());
    }
    
}
