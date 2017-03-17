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
            throw new Exception("�޷�����");
        }
        if(i==maxSize){
            throw new Exception("����");
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
            throw new Exception("���Ѿ�ɾ�����");
        }
        if(i<0||i>maxSize){
            throw new Exception("���ֲ���Ŷ");
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
            throw new Exception("����Ŷ");
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
