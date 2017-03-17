package test;

/**
 * Created by admin on 2017/3/1.
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(a());
    }
    public static int a(){
        try{
            int i=0;
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return 1;
        }
    }
}
