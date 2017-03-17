package anonymousInnerClass;

import java.util.ArrayList;

/**
 * Created by admin on 2017/2/20.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        System.out.println(list.toString());

        System.out.println(new ArrayList<String>(){{add("1");add("2");}});

        System.err.println("Something awful happened in"+new Object(){}.getClass().getEnclosingClass());
    }
}
