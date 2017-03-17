package test;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by admin on 2017/2/23.
 */

public class Test1
{
    public static int aMethod(int i)throws Exception
    {
        try{
            return i / 0;
        }
        catch (Exception ex)
        {
            System.out.printf("exception in method");
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }

    public static void main(String [] args)
    {
        try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}