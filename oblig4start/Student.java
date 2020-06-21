
/**
 * Write a description of class Student here.
 *
 * @author Hallvard Moan Kristiansen
 * @version Alpha 1.27
 */
public class Student extends Person
{
    private String Username;
    public String role= "Student";

    public Student (String name, String username) {
        super (name);
        this.Username = Username;
    }

    public String getRole(){
        return "Student" ;
    }

    @Override 
    public String toString() {
        return getName() + getRole();
    }

    public String getUsername() {
        return Username;
    }
}
