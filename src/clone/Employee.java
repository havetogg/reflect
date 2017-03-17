package clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by admin on 2017/2/14.
 */
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee)super.clone();
        cloned.hireDay = (Date)hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year,int month,int day){
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();

    }

    /*public List<Area> findAllChild(Long areaId){
        List<Area> areaList = new ArrayList<>();
        Area area = areaDao.findOne(areaId);
        if("4".equals(area.getType())) {
            areaList.add(area);
            return areaList;
        }
        for(Area area1:area.getChildList()){
            areaList.addAll(findAllChild(area1.getId()));
        }
        return areaList;
    }*/
}
