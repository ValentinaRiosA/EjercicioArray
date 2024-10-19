import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> commonElements = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        for(int i=0; i< list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i).equals(list2.get(j))){
                    commonElements.add(list1.get(i));
                }
            }
        }
        for(String iguales:commonElements){
            System.out.println(iguales  + " ");
        }
    }
}
