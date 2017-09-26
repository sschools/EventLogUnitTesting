import com.ironyard.EventLog;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import com.ironyard.Event;

import static org.junit.Assert.*;

public class EventLogTests {
    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testGoodEvent() throws Exception {
        Event testEvent1 = new Event("Coffee Shop Meeting", "Face2Face");
        Event testEvent2 = new Event("Call Elaine", "PhoneCall");
        Event testEvent3 = new Event("Text George", "TextMessaging");
        Event testEvent4 = new Event("Get Kramer's Keys", "Unknown");
        System.out.println("Running Good Event Test");
        assertTrue(EventLog.addEvent(testEvent1));
        assertTrue(EventLog.addEvent(testEvent2));
        assertTrue(EventLog.addEvent(testEvent3));
        assertTrue(EventLog.addEvent(testEvent4));
    }

    @Test
    public void testBadEvent() throws Exception {
        Event testEvent1 = new Event("Walk Dog", "Walk");
        Event testEvent2 = new Event("Go for a run", "Exercise");
        System.out.println("Testing Bad Input");
        expected.expect(IllegalArgumentException.class);
        EventLog.addEvent(testEvent1);
        EventLog.addEvent(testEvent2);
    }

    @Test
    public void testNullInput () throws Exception {
        Event testEvent = new Event("", "");
        System.out.println("Testing Illegal Input");
        expected.expect(IllegalArgumentException.class);
        EventLog.addEvent(testEvent);
    }
}
