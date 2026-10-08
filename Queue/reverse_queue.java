import java.util.*;

public class reverse_queue {

    static void rev(Queue <Integer> q1){
        int size = q1.size();
        Stack <Integer> temp = new Stack<>();

        for(int i=1; i<=size;i++){
            temp.add(q1.remove());
        }

        for (int i=1; i<=size;i++){
            q1.add(temp.pop());
        }

    }
    public static void main(String[] args) {
         Queue <Integer> q = new LinkedList<>();

        for(int i=1;i<6;i++){q.add(i);}

        System.out.println("Orignal queue" + q);

        rev(q);

        System.out.print("Reversed Array:" + q);
    }
}
