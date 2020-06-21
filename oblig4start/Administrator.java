/**
 * Write a description of class Administrator here.
 *
 * @uthor (Hallvard Moan Kristiansen)
 * @version (Alpha 1.27)
 */
public interface Administrator

{
    public String getRole();

    public String getName();

    default public void suspend(Student student, String justification){
        System.out.println("Du er suspendert" + getName() + getRole()); 
        System.out.println("Justification" + justification + " ");
    }

}
