package dataStructure;

/**
 * Created by admin on 2017/2/28.
 */
public class LinList implements List{
    private Node head;
    private Node current;
    private int size;

    public LinList() {
        head = current = new Node(null);
        head.setNext(head);
        head.setPrior(head);
        size=0;
    }

    public void index(int i) throws Exception{
        if(i<-1||i>size-1){
            throw new Exception("λ�ò���ȷ");
        }
        if(i==-1) return;
        current = head.getNext();
        int j=0;
        while(current!=head&&j<i){
            current = current.getNext();
            j++;
        }
    }

    @Override
    public void insert(int i, Object o) throws Exception {
        if(i<0||i>size){
            throw new Exception("��������");
        }
        index(i-1);
        Node node = new Node(o,current.getNext(),current);
        current.getNext().setPrior(node);
        current.setNext(node);
        size++;
    }

    @Override
    public Object delete(int i) throws Exception {
        if(size==0){
            throw new Exception("��������Ŷ");
        }
        if(i<0||i>size-1){
            throw new Exception("��������");
        }
        index(i-1);
        Object object = current.getNext().getElement();
        current.setNext(current.getNext().getNext());
        current.getNext().getNext().setPrior(current);
        size--;
        return object;
    }

    @Override
    public Node getData(int i) throws Exception {
        if(i<0||i>size-1){
            throw new Exception("��������");
        }
        index(i);
        return current;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
