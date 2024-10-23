import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("Vale", 26);
        Persona per3 = new Persona("Jero", 1);
        Persona per2 = new Persona("Adde", 33);

        List<Persona> personitas = new ArrayList<>();

        personitas.add(per1);
        personitas.add(per2);
        personitas.add(per3);

        System.out.println("Sin Orden");
        System.out.println(personitas.toString());

        Collections.sort(personitas);

        System.out.println("Con Orden");
        System.out.println(personitas.toString());

    }
}