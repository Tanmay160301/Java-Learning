import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        arrayList.add("Tanmay");
        arrayList.add(12);
        arrayList.add(true);
        
        System.out.println(arrayList);
        for (Object object : arrayList) {
            System.out.println(object);
        }

    }
}
