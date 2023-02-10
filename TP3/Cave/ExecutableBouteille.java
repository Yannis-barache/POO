public class ExecutableBouteille {
    public static void main ( String [] args ) {
    Bouteille a = new Bouteille ( "Bordeaux" , "Pomerol" , 2007) ;
    assert "Bordeaux".equals(a.getRegion () ) ;
    assert "Pomerol".equals(a.getAppellation () ) ;
    assert 2007 == a.getMillesime();
    Bouteille b = new Bouteille ("Bordeaux","Pomerol",2007) ;
    Bouteille c = new Bouteille ( "Bordeaux","Pomerol",2003) ;
    assert a.equals ( b ) ;
    assert !a.equals ( c ) ;
    }
}
