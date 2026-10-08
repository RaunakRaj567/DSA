
import java.util.LinkedList;
import java.util.Queue;

public class traverse_queue {
    public static void main(String[] args) {
        Queue <Integer> q1 = new LinkedList<>();

        for(int i=1;i<24;i=i+2){
            q1.add(i);
        }
        System.out.println(q1);

        for(int i=1; i<=q1.size(); i++){
            System.out.print(q1.peek()+" ");

            q1.add(q1.remove());
        }
    }
    
}
 