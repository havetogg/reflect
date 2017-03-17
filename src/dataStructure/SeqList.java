package dataStructure;

import java.util.ArrayList;

/**
 * Created by admin on 2017/2/28.
 */
public class SeqList implements List{
    private final int defaultSize = 10;
    private int maxSize;
    private int size;
    private static Object[] objects;

    public SeqList() {
        init(defaultSize);
    }

    public SeqList(int size) {
        init(size);
    }

    public void init(int size){
        maxSize=size;
        size=0;
        objects=new Object[size];
    }

    @Override
    public void insert(int i, Object o) throws Exception {
        if(i<0||i>size()){
            throw new Exception("无法插入");
        }
        if(i==maxSize){
            throw new Exception("满了");
        }
        for(int j=i+1;j<maxSize;j++){
            objects[j]=objects[j-1];
        }
        objects[i] = o;
        size++;
    }

    @Override
    public Object delete(int i) throws Exception {
        if(size==0){
            throw new Exception("表已经删除完毕");
        }
        if(i<0||i>maxSize){
            throw new Exception("数字不对哦");
        }
        Object object = objects[i];
        for(int j=i;j<size();j++){
            objects[j]=objects[j+1];
        }
        objects[size]=null;
        size--;
        return object;
    }

    @Override
    public Object getData(int i) throws Exception {
        if(i<0||i>size){
            throw new Exception("不对哦");
        }
        return objects[i];
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return size()<=0;
    }

    public int MoreDataDelete(SeqList seqList,Object object) throws Exception{
        int tag = 0;

        for(int i=0;i<seqList.size;i++){
            if(object.equals(seqList.getData(i))){
                seqList.delete(i);
                i--;
                tag=1;
            }
        }
        return tag;
    }
}
