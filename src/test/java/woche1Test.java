import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Queue;

public class woche1Test {

    @Test
    void testGibListeMitEingefügtemWert() {
        List<Double> erwartet = List.of(1.2, 2.5, 10.0, 3.1, 4.0, 5.6);
        List<Double> ergebnis = woche1.gibListeMitEingefügtemWert();
        assertEquals(erwartet, ergebnis);

    }

    @Test
    void testLängeDerAusgabe() {
        List<Double> erwartet = List.of(1.2, 2.5, 10.0, 3.1, 4.0, 5.6);
        assertEquals(erwartet.size(), 6);
    }

    @Test
    void testNumberWirdAddiert() {
        List<Double> list = List.of(1.2, 2.5, 3.1, 4.0, 5.6);
        List<Double> addedList = woche1.gibListeMitEingefügtemWert();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            addedList.get(list.size() + 1);
        });
    }

    // Queue Test
    @Test
    void testQueueMethod() {
        Queue<String> q = woche1.queueMethod();

        assertEquals(3, q.size());
        assertEquals("a", q.poll());
        assertEquals("b", q.poll());
        assertEquals("c", q.poll());
        assertTrue(q.isEmpty());
    }
}