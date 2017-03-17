package dataStructure;

/**
 * Created by admin on 2017/3/13.
 */
public interface Queue
{
    public void append(Object obj) throws Exception;
    public Object delete() throws Exception;
    public Object getFront() throws Exception;
    public boolean notEmpty();
}
