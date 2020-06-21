import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Test class MessageDataBaseTest
 * @author your boi Hallvard
 * @Version Alpha 1.10.2
 */

public class TestMessageDatabase
{
    @Test
    public void testReset()
    {
        ArrayList<Message> empty = new ArrayList<>();
        MessageDatabase.setMessages(empty);
        assertEquals(0, MessageDatabase.getMessages().size());

    }

    @Test
    public void testIncrement()
    {
        int n = MessageDatabase.getMessages().size();

        Person p1 = new Person ("Jens");
        Person p2 = new Person ("Olav");
        Message message = new Message (p1, p2, "Tjena grabben");
        MessageDatabase.addMessage(message);

        assertEquals(n + 1, MessageDatabase.getMessages().size());
    } 
}