package staticInnerClass;

/**
 * Created by admin on 2017/2/22.
 */
public abstract class JustForTest {
    public JustForTest(){
        System.out.println("hehe");
    }
    public static void test(){
        System.out.println("nimei");
    }

    public static void main(String[] args) {
        JustForTest.test();
    }
}
