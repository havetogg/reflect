package reflection;

import java.lang.reflect.Method;

/**
 * Created by admin on 2017/2/13.
 */
public class MethodTableTest{
    public static void main(String[] args) throws Exception{
        Method square = MethodTableTest.class.getMethod("square",double.class);
        Method sqrt = Math.class.getMethod("sqrt",double.class);

        printTable(1,10,10,square);
        printTable(1,10,10,sqrt);
    }

    public static double square(double x){
        return x*x;
    }

    public static void printTable(double from,double to,int n,Method f){
        System.out.println(f);

    }
}
