package dataStructure;

/**
 * Created by admin on 2017/2/28.
 */
public class Node {
    private Object element;
    private Node next;
    private Node prior;

    public Node(Node next) {
        this.next = next;
    }

    public Node(Object element, Node next,Node prior) {
        this.element = element;
        this.next = next;
        this.prior = prior;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrior() {
        return prior;
    }

    public void setPrior(Node prior) {
        this.prior = prior;
    }

    public String toString(){
        return element.toString();
    }
}
