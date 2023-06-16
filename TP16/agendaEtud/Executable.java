import java.text.ParseException ;
public class Executable{

    public static void main(String[] args)
    {
        Agenda agenda = new Agenda();
        try{
            agenda.ajoute(new RendezVous("10:05/03/2017", "11:05/03/2017"));
            agenda.ajoute(new RendezVous("11:05/03/2017", "12:05/03/2017"));
            agenda.ajoute(new RendezVous("9:05/03/2017", "10:05/03/2017"));
            agenda.ajoute(new RendezVous("8:05/03/2017", "9:05/03/2017"));
            agenda.ajoute(new RendezVous("12:05/03/2017", "13:05/03/2017"));

            for(RendezVous rdv: agenda){
                System.out.println(rdv);
            }


        }
        catch(ParseException e)
        {
            System.out.println(e);
        }
        catch(PasDeDisponibiliteException e){
            System.out.println(e); 
        }
    }
}
