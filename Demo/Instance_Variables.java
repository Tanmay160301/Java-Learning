package Demo;

public class Instance_Variables {
    static String name ="Tanmay";
    public static void main(String[] args) {
        Instance_Variables obj1 = new Instance_Variables();
        System.out.println(obj1.name);
        obj1.name = "Anish";
        System.out.println(obj1.name);


        System.out.println("===========================================");
        Instance_Variables obj2 = new Instance_Variables();
        System.out.println(obj2.name); // separate copy bannar instance variable for each and every object

    }

}
