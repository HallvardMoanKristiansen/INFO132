/**
 * Write a description of class Person here.
 * 
 * @author (Hallvard Moan Kristiansen) 
 * @version (Alpha 1.04)
 */
public class Person //Klasssen til Personen
{
    /* Feltene for klassen Person */
    private String name;
    private boolean isOnline;

    
    public Person(String name) // Dette er konstruktøren til "Person".
    {
        /* Setter feltet i klassen til å være lik navnet i konstruktøren */
        this.name = name;
    }

    
    private String getName() //Get'er som returnerer feltet name 
    {
        //Returnerer navnet.
        return name;
    }

    
    public void setIsOnline(boolean isOnline) //Set'er feltet i klassen til isOnline
    {
        this.isOnline = isOnline;
    }

    
    public boolean getIsOnline() //Get'er returnerer feltet isOnline
    {
        return isOnline;
    }

    
    public void recieveMessage(Message message) //printer ut meldingen
    {
        if(message.getSender().getIsOnline()) 
        {
            System.out.println("From: " +  message.getSender().getName() + " " + "Online");
        }
        else
        {
            System.out.println("From: " +  message.getSender().getName() + " " + "Offline");
        }
        {
            System.out.println("To: " + name );
            System.out.println("Message: ");
            System.out.println(message.getMessageBody());
        }
    }
}
 