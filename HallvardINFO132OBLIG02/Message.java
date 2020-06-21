/**
 * Write a description of class Message here.
 * 
 * @author (Hallvard Moan Kristiansen) 
 * @version (Alpha 1.04)
 */
public class Message
{
    /* Lager felter for klassen Message */
    private Person sender; 
    private String messageBody;

    public Message(Person sender, String messageBody) /*Setter konstruktør til message*/
    {
        this.sender = sender; 
        this.messageBody = messageBody;
    }

    
    public Person getSender() /* Metode som returnerer person objektet*/
    {
        return sender;
    }

    
    public String getMessageBody() /* Metode som returnerer meldingen*/
    {
        return messageBody;
    }
}