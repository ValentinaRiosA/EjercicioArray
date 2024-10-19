import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("For Normal");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println("\nFor each");
        for(int numeros:numbers){
            System.out.print(numeros  + " ");
        }

        System.out.println("\nWhile");
        int ind=numbers.size() -1;
        while (ind>=0){
            System.out.print(numbers.get(ind) + " ");
            ind--;
        }
    }
}
