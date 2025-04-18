import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
}