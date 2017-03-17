package test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by admin on 2017/3/10.
 */
public class TestNear {
    public static int near(int[] a){
        long start = System.nanoTime();
        long end = 0L;
        Arrays.sort(a);
        if(Arrays.binarySearch(a,2)>=0){
            end = System.nanoTime();
            System.out.println("1:"+(end-start));
            return a[Arrays.binarySearch(a,0)];
        }else{
            for(int i=2,j=2;i>=a[0]||j<=a[a.length-1];i--,j++){
                if(Arrays.binarySearch(a,i)>=0){
                    end = System.nanoTime();
                    System.out.println("1:"+(end-start));
                    return a[Arrays.binarySearch(a,i)];
                }
                if(Arrays.binarySearch(a,j)>=0){
                    end = System.nanoTime();
                    System.out.println("1:"+(end-start));
                    return a[Arrays.binarySearch(a,j)];
                }
            }
        }
        end = System.nanoTime();
        System.out.println("1:"+(end-start));
        return -1;
    }

    public static int near2(int[] a){
        long start = System.nanoTime();
        long end = 0L;
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=Math.abs(a[i]-2);
        }
        Arrays.sort(b);
        if(Arrays.binarySearch(a,2+b[0])>=0){
            end = System.nanoTime();
            System.out.println("2:"+(end-start));
            return a[Arrays.binarySearch(a,2+b[0])];
        }
        if(Arrays.binarySearch(a,2-b[0])>=0){
            end = System.nanoTime();
            System.out.println("2:"+(end-start));
            return a[Arrays.binarySearch(a,2-b[0])];
        }
        end = System.nanoTime();
        System.out.println("2:"+(end-start));
        return -1;
    }



    public static void main(String[] args) {
        AbstractList<Integer> list1 = new ArrayList<>();
        for(int i=-2837;i<-74;i+=2){
            list1.add(i);
        }
        for(int i=154;i<4816;i+=2){
            list1.add(i);
        }
        Integer[] a1 = list1.toArray(new Integer[list1.size()]);
        int[] a2 = new int[a1.length];
        for(int i=0;i<a1.length;i++){
            a2[i]=a1[i];
        }
        int b = TestNear.near(a2);
        int c = TestNear.near2(a2);
        System.out.println(b);
        System.out.println(c);
    }
}
