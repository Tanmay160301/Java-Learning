package Demo;

import java.util.*;

public class Demo {
    static int x =10;
    int y = 20;

    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        arrayList.add("Tanmay");
        arrayList.add(12);
        arrayList.add(true);
        
        System.out.println(arrayList);
        for (Object object : arrayList) {
            System.out.println(object);
        }
        System.out.println(x); // Since x is static we can directly write x or Demo.x
        //System.out.println(y); // To use y we need to create an object of the class
    }
}
