package dataStructure;

import java.util.*;

/**
 * Created by admin on 2017/3/13.
 */
public class SeqQueue implements Queue{
    static final int defaultSize = 10;
    int front; //��ͷ
    int rear;  //��β
    int count; //������
    int maxSize;
    Object[] data;

    public SeqQueue(){
        initiate(defaultSize);
    }

    public SeqQueue(int sz){
        initiate(sz);
    }

    private void initiate(int sz){
        maxSize = sz;
        front = rear =0;
        count = 0;
        data = new Object[sz];
    }

    @Override
    public void append(Object obj) throws Exception {
        if(count>0&&front==rear){
            throw new Exception("��������");
        }
        data[rear] = obj;
        rear = (rear+1)%maxSize;
        count++;
    }

    @Override
    public Object delete() throws Exception {
        if(count==0){
            throw new Exception("���п���");
        }
        Object temp = data[front];
        front = (front+1)%maxSize;
        count--;
        return temp;
    }

    @Override
    public Object getFront() throws Exception {
        if(count==0) throw new Exception("���п���");
        return data[front];
    }

    @Override
    public boolean notEmpty() {
        return count!=0;
    }
}
