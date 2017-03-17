package objectAnalyzer;

import java.util.ArrayList;

/**
 * Created by admin on 2017/2/10.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args){
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i=0;i<=5;i++){
            squares.add(i*i);
        }
        System.out.print(new ObjectAnalyzer().toString(squares));
    }
}
