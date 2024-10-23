public class Persona implements Comparable<Persona>{
    private String nombre;
    private int age;

    public Persona(String nombre, int age){
            this.nombre = nombre;
            this.age = age;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        if (this.age > otraPersona.getAge()) {
            return -1;
        }
        if (this.age < otraPersona.getAge()) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return this.nombre;
    }

    public void setName(String newName) {
        this.nombre = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    @Override
    public String toString() {
        return nombre + " " +  age;
    }
}
