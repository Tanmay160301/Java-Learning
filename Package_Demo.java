import Package_Study.tools.AdvCalc;
import Package_Study.tools.Calc;

public class Package_Demo {
    public static void main(String[] args) {
        Calc cal = new Calc();
        AdvCalc ad = new AdvCalc();
        int res_add = cal.add(2,3);
        System.out.println(res_add);

        int res_sub = cal.sub(2,3);
        System.out.println(res_sub);
        int res_mul = ad.mul(2,3);
        System.out.println(res_mul);
        int res_div = ad.div(2,3);
        System.out.println(res_div);

    }
}
