import java.util.Scanner;
/**
 * Client functions as an interface between a user and the network. The 
 * user interacts with the client by typing commands. The user can send messages 
 * to other users.
 * 
 * @author     Hallvard Moan Kristiansen
 * @version    Alpha 1.05
 */
public class UserInput
{
    private Scanner reader;

    public UserInput(){
        reader = new Scanner(System.in);
    }

    public String getInput() 
    {
        return getInput("> ");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);                // print prompt
        String inputLine = reader.nextLine();
        return inputLine;
    } 

    public String getMultilineInput(String prompt) {
        System.out.println(prompt);

        String result = "";
        while(true) {
            String inputLine = reader.nextLine();
            if(inputLine.equals("")) {
                return result;
            } else {
                result += inputLine + "\n";
            }
        }
    }
}