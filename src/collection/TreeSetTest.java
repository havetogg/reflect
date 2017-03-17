package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by admin on 2017/3/2.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Student.compareToStudent());
        treeSet.add(new Student(2,"zhangshan"));
        treeSet.add(new Student(3,"lishi"));
        treeSet.add(new Student(1,"wangwu"));
        treeSet.add(new Student(4,"maliu"));

        Iterator it=treeSet.iterator();
        while(it.hasNext())
        {
            Student s = (Student) it.next();
            System.out.println(s.num+" "+ s.name);
        }
    }
}
class Student implements Comparable<Student>{
    int num;
    String name;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        int result = num>o.num?1:(num==o.num?0:-1);
        if(result==0){
            result = name.compareTo(o.name);
        }
        return result;
    }

    static class compareToStudent implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            int rulst= o2.num > o1.num ? 1 : (o2.num==o1.num ? 0 :-1);
            if(rulst==0)
            {
                rulst=o2.name.compareTo(o1.name);
            }
            return rulst;
        }
    }
}
