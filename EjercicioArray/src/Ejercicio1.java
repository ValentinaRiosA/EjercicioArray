import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits.size());
        fruits.remove(1);
        fruits.set(1,"Orange");
        System.out.println(fruits);

    }
}