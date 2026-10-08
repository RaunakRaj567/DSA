
import java.util.*;

public class reverse_k_queue {
    static void k_rev(Queue <Integer> q1,int k){
        int size = q1.size();

        Stack <Integer> temp = new Stack<>();

        for(int i=1;i<=k;i++){
            temp.add(q1.remove());
        }

        for (int i=1; i<=k;i++){
            q1.add(temp.pop());
        }

        for (int i=1; i<=size-k; i++){
            q1.add(q1.remove());
        }
    }
    public static void main(String[] args) {
         Queue <Integer> q = new LinkedList<>();

        for(int i=1;i<6;i++){q.add(i);}

        System.out.println("Orignal queue" + q);

        k_rev(q, 3);

        System.out.println("K-reversed queue:"+q);
    }
    
}
