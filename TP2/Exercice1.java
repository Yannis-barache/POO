//Question 1 

List < Pokemon > pokedex = new ArrayList < >() ;
3 pokedex . add ( etourmi ) ; //oui
4 pokedex . add ( chenipan , 4) ; //non 
5 pokedex . add (3 , abo ) ; // oui
6 pokedex . set ( feurisson ) ; //non 
7 pokedex . set ( bulbizarre , 12) ;//non 
8 pokedex . set (4 , griknot ) ;//non 
9 pokedex . get ( feurisson ) ;//non 
10 pokedex . get (12) ;//oui 
11 pokedex . pop ( abo ) ;//non 
12 pokedex . pop (3) ;//non 
13 pokedex . remove ( dardagnan ) ;//oui
14 pokedex . remove (2) ;//oui
15 pokedex . removeRange (3 , 5) ;//oui

//Question 2 


List<Pokemon> liste = pokedex . subList (1 , 4) ; 
int taille = pokedex . size () ;
Pokemon pokemon3 = pokedex . get (2) ;
boolean joutOk = pokedex . add ( hydragon ) ;
boolean retireOk = pokedex . remove ( dardagnan ) ;