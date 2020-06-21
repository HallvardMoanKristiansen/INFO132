import java.util.ArrayList;

/**
 * Write a description of class Person here. Remember to write 
 * a good class description, and your self as the author.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // the person's name
    private String name;

    // a list of this person's friends
    private ArrayList<Person> friends;

    /**
     * Constructor for objects of class Person. When the object
     * is created, the person's list of friends is empty.
     */
    public Person(String name)
    {
        // initialise instance variables
        this.name = name;
        friends = new ArrayList<>();    
    }

    public void printFriends(){
        for (Person friend : friends){
            System.out.println(friend.getName());
        }
    }

    public void printFriendsStream(){
        friends.stream()
        .forEach(friend -> System.out.println(friend.getName()));
    }

   public Person mostConnectedFriend (){
        if (friends.size() > 0) {        
            Person currentMostConnected = friends.get(0);
            int highestNum = 0;
            for (Person friend : friends){
                if(friend.getFriends().size() > highestNum){
                    currentMostConnected = friend;
                    highestNum = friend.getFriends().size();
                }
            }  
            return currentMostConnected;
        }
        return null;
    }

    /**
     * Method getName returns the person's name.
     *
     * @return The person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Method getFriends returns an ArraList of Person-objects 
     * containing the person's friends. 
     *
     * @return The list of the person's friends
     */
    public ArrayList<Person> getFriends() {
        return friends;
    }

    /**
     * Method addFriend adds the given friend-object to this
     * person's friend list. 
     *
     * @param friend A new friend (added to the list of friends)
     */
    public void addFriend(Person friend) {
        friends.add(friend);
    }
}
