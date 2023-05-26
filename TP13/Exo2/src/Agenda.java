import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class Agenda 
{
    private List<RendezVous> contenu;

    public Agenda(){
        this.contenu = new ArrayList<RendezVous>();

    } 

    public RendezVous getPremier()  throws AgendaVideException
    {
        if (this.contenu.isEmpty())
        {
            throw new AgendaVideException();
        }
        return Collections.min(this.contenu);
    }                       {

    }

    public void ajoute (RendezVous rendezVous)
    {
    }
    @Override
    public String toString()
    {
    
    }

    class AgendaVideException extends Exception
    {
       
    }
}
