import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Medellin");
        ciudades.add("Bogota");
        ciudades.add("Cali");
        ciudades.add("Pereira");
        ciudades.add("Florencia");

        System.out.println("Ciudades ordenadas");
        for (String city : ciudades) {
            System.out.print(city + " ");
        }
        System.out.println("\nCiudades Desordenadas");
        Collections.shuffle(ciudades);
        for (String city : ciudades) {
            System.out.print(city + " ");
        }
    }
}
