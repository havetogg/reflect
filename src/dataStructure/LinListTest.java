package dataStructure;

/**
 * Created by admin on 2017/2/28.
 */
public class LinListTest {
    public static void main(String[] args) {
        LinList linList = new LinList();
        int n=10;
        try{
            for(int i=0;i<n;i++){
                linList.insert(i,new Integer(i+1));
            }
            /*for(int i=0;i<linList.size();i++){
                System.out.println(linList.getData(i)+" ");
            }*/
            System.out.println(linList.getData(1).getNext().getPrior().getNext().getPrior().getPrior()+" ");
        }catch (Exception e){

        }
    }
}
