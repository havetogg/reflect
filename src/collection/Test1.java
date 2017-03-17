package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2017/3/2.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Integer[] i = list.toArray(new Integer[list.size()]);
        for(int j:i){
            System.out.println(j);
        }
        System.out.println(i);
        List<Integer> list2=Arrays.asList(i);
        System.out.println(list2);
    }
}
