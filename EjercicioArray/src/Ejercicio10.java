import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        int con = 0;
        animal.add("Perro");
        animal.add("Gato");
        animal.add("Vaca");
        animal.add("Raton");

        for (String anim : animal) {
            if(anim.contains("Vaca")){
                System.out.print("Se encuentra: " + anim);
            }
        }
}
}
