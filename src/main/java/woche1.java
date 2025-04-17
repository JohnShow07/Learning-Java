import java.util.List;
import java.util.ArrayList;

public class woche1 {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(1, 2, 3, 4, 5));

    
        ints.add(2, 10);

        System.out.println(ints.get(2));
        
        for(int i = 0; i < ints.size(); i++){
            System.out.println(ints.get(i));
        }

    }
}