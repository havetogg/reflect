package dataStructure;

/**
 * Created by admin on 2017/2/28.
 */
public interface List {
    public void insert(int i,Object o) throws Exception;
    public Object delete(int i) throws Exception;
    public Object getData(int i) throws Exception;
    public int size();
    public boolean isEmpty();
}
