import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <=5; i++) {
            list1.add(i);
        }

        int[] numeros = new int[list1.size()];

        for (int i = 0; i <numeros.length; i++) {
            numeros[i]=list1.get(i);
            System.out.println(numeros[i]);
        }

    }
}
