
/**
 * Write a description of class Rector here.
 *
 * @author Hallvard Moan Kristiansen
 * @version Alpha 1.27
 */
public class Rector extends Person implements Administrator
{
    public String valgLøfte;
    public String role= "Rector";

    public Rector (String name, String valgLøfte) {
        super (name);
        this.valgLøfte = valgLøfte;
    }

    public String getValgLøfte(){
        return valgLøfte;
    }

    public String getRole(){
        return "Rector" ;
    }

    @Override 
    public String toString() {
        return getName() + getRole();
    }

    public void commend(Convenor lecturer, String commendation) {
        System.out.println("skriver navnet til mottageren og meldingen til terminal." + " ");
    }

}