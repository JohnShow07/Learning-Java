import java.util.List;
import java.util.ArrayList;

public class woche1 {

    public static List<Double> gibListeMitEingefügtemWert() {
        List<Double> d = new ArrayList<>(List.of(1.2, 2.5, 3.1, 4.0, 5.6));
        d.add(2, 10.0);
        return d;
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        ints.add(2, 10);

        System.out.println(ints.get(2));

        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }

        List<Double> doubles = gibListeMitEingefügtemWert();

        for (Double dd : doubles) {
            System.out.println(dd);
        }

    }
}