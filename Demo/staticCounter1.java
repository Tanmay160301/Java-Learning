package Demo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Declare static variables inside the class, outside methods or blocks.
//You can access them without creating an object: ClassName.varName.
//All instances share the same static variable.
class staticCounter{
    static int counter = 0;
    String name;
    int times = 0;

    staticCounter(String name){
        this.name = name;
    }

    void updateCounter(){
        counter = counter+1;
        this.times++;
    }
}

class  staticCounter1{

    public static void main(String[] args) {

        System.out.println("The current value of counter is "+ staticCounter.counter);
        System.out.println("The counter variable must be modified");
        System.out.println("Select the number of times the counter must be updated");
        Scanner sc = new Scanner(System.in);
        int timesCount = sc.nextInt();


        staticCounter obj1 = new staticCounter("Tanmay");
        staticCounter obj2 = new staticCounter("Yash");
        staticCounter obj3 = new staticCounter("Varad");
        staticCounter obj4 = new staticCounter("Viraj");

        ArrayList<staticCounter> base = new ArrayList<>();
        base.add(obj1);
        base.add(obj2);
        base.add(obj3);
        base.add(obj4);

        for(int i = 0; i<timesCount ; i++){
            Random random = new Random();
            int index = random.nextInt(4); //0 to 3
            staticCounter currIteration = base.get(index);
            currIteration.updateCounter();


        }
        System.out.println("============================================");
        System.out.println("The final value of counter is "+staticCounter.counter);

        for (int i = 0; i < base.size(); i++) {
            staticCounter obj  = base.get(i);
            System.out.println(obj.name + " has modified counter "+ obj.times + " times.");
        }
    }

}


