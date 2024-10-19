import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            numbers.add(i);
        }

        for (int i = 0; i <numbers.size(); i++) {
            if (numbers.get(i)%2==0){
                evenNumbers.add(numbers.get(i));
            }
        }

        System.out.println("Lista Original");
        for(int numeros:numbers){
            System.out.print(numeros  + " ");
        }
        System.out.println("\nLista Pares");
        for(int numeros:evenNumbers){
            System.out.print(numeros  + " ");
        }
    }
}