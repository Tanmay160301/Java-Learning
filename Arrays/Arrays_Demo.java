package Arrays;

public class Arrays_Demo {
    public static void main(String[] args) {
        String[] friends= {
          "Tanmay",
          "Yash",
          "Varad",
          "Viraj"
        };

        for (String friend : friends){
            System.out.println(friend);
        }
        System.out.println("Length is :"+friends.length);
    }
}
