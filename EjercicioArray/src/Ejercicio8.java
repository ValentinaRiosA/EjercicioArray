import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {
        List<String> semana = new ArrayList<>();

        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");

        System.out.println("Semana ordenada");
        for (String dias : semana) {
            System.out.print(dias + " ");
        }
        System.out.println("\nSemana Desordenada");
        Collections.shuffle(semana);
        for (String dias : semana) {
            System.out.print(dias + " ");
        }

    }
}