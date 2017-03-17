package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by admin on 2017/2/14.
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"mer","ven","ear","mar","jup","sat","ura","nep"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sort");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, events-> System.out.println("The time is"+new Date()));
        t.start();

        JOptionPane.showMessageDialog(null,"Quit Program?");
        System.exit(0);
    }
}
