package test;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by admin on 2017/3/10.
 */
public class testReverse {
    public static char[] reverse1(char[] a){
        long start = System.nanoTime();
        char end='0';
        if(a.length%2!=0){
            end=a[a.length-1];
        }
        a = Arrays.copyOf(a,a.length-1);
        for(int i=0;i<a.length-1;i+=2){
            char tem = a[i];
            a[i] = a[i+1];
            a[i+1] = tem;
        }
        a = Arrays.copyOf(a,a.length+1);
        a[a.length-1]=end;
        long endt = System.nanoTime();
        System.out.println("1:"+(endt-start));
        return a;
    }

    public static char[] reverse2(char[] a){
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        char end='0';
        if(a.length%2!=0){
            end=a[a.length-1];
        }
        Stack stack = new Stack();
        for(char c:a){
            if(stack.size()==2){
                sb.append(stack.pop());
                sb.append(stack.pop());
            }
            stack.push(c);
        }
        sb.append(end);
        String s = new String(sb);
        long endt = System.nanoTime();
        System.out.println("2:"+(endt-start));
        return s.toCharArray();
    }
    public static void main(String[] args) {
        char[] a = new char[]{'a','b','e','f','k','d','e'};
        char[] a2 = new char[]{'a','b','e','f','k','d','e'};
        System.out.println(testReverse.reverse1(a));
        System.out.println(testReverse.reverse2(a2));
    }
}
