import java.util.ArrayList;
/**
 * Write a description of class Convenor here.
 *
 * @author Hallvard Moan Kristiansen
 * @version Alpha 1.27
 */
public class Convenor extends Person implements Administrator
{
    private String kompetanseBeskrivelse;
    public String role= "Convenor";

    public Convenor (String name, String kompetanseBeskrivelse) {
        super (name);
        this.kompetanseBeskrivelse = kompetanseBeskrivelse;
    }

    public String getKompetanseBeskrivelse() {
        return kompetanseBeskrivelse;
    }

    public String getRole(){
        return "Student" ;
    }

    @Override 
    public String toString() {
        return getName() + getRole();
    }

    public void announce(ArrayList<Student> courseMembers, String announcement) {
        for (Student student : courseMembers) {
            System.out.println (student.getName());
        }
        System.out.println ("skriver navnet til mottageren og meldingen til terminal: " + announcement);  
    }

}

