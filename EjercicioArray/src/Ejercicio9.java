import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) {
        List<String> semana = new ArrayList<>();
        int con = 0;
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Lunes");
        semana.add("Jueves");
        semana.add("Martes");
        semana.add("Sabado");
        semana.add("Lunes");
        for (int i = 0; i < semana.size(); i++) {
                if (semana.get(i).equals("Lunes")) {
                    con++;
                }
        }
        System.out.println(con);
    }
}
