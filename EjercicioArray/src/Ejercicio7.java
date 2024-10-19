import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println(uniqueNumbers);

    }
}
