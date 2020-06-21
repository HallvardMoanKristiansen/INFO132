import java.util.Scanner;
import java.util.ArrayList;

/**
 * Client functions as an interface between a user and the network. The 
 * user interacts with the client by typing commands. The user can send messages 
 * to other users.
 * 
 * @author     Hallvard Moan Kristiansen
 * @version    Alpha 1.05
 */
public class Client
{
    private Scanner reader;
    private Network network;
    private Person user;
    private Message list;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public Client()
    {
        network = Network.getNetwork();

    }

    /**
     * Method start runs the client-program. It consists of two main
     * phases: login and working. 
     * 
     * During the login-phase the user will be asked to identify herself. 
     * The username given must match an existing person exactly. 
     * 
     * During the working-phase the user will send commands to the client. 
     * The client can send messages (initiated by the command "message") and 
     * quit (initiated by the command "bye"). 
     *
     * The method is incomplete. See assignments 2 and 4.
     */
    public void start() {
        boolean loggedIn = false;
        UserInput userInput = new UserInput(); 

        while(!loggedIn){
            String username = userInput.getInput("Username: ");
            user = network.lookupPerson(username);
            loggedIn = user != null;
        }

        printWelcome();

        boolean finished = false;
        while(!finished) {
            String input = userInput.getInput();
            if (input.equals("read")){
                printMessages();
            }

            if(input.equals("bye")) {
                finished = true;
            } else if(userInput.equals("message")) {
                String recipientName = userInput.getInput("To: ");
                Person recipient = network.lookupPerson(recipientName);
                if (recipient != null) {
                    String messageBody = userInput.getMultilineInput("Message: ");
                    Message message = new Message(user, recipient, messageBody);
                    MessageDatabase.addMessage(message);
                }
            }
            else if (input.equals("help")){
                printHelp();
            }
        }

        printGoodbye();
    }

    /**
     * Oppgave 4
     * Definerer printOutmessages
     */
    private void printMessages() {
        ArrayList<Message> RealMessage = new ArrayList<Message>();
        RealMessage = MessageDatabase.getMessagesFromFriendsTo(user);
        for (Message list : RealMessage){
            System.out.println(list.getSender().getName());
            System.out.println(list.getMessageBody());
        }
    }
    //Starter clienten i et steg
    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
    //Gir en velkomst til userName og informerer om help funksjonen
    private void printWelcome() {
        System.out.println("Welcome to the messaging client, " 
            + user.getName() + ".");
        System.out.println("Type 'help' to get instructions.");
    }
    //Sender melding "good bye" til user
    private void printGoodbye() {
        System.out.println("Good bye, " + user.getName() + "!");
    }
    //Printer ut hjelp message
    private void printHelp(){
        System.out.println("Type message to send a message, type bye to end chat. ");
    }
}