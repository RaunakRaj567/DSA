import java.util.LinkedList;
import java.util.Queue;

public class Queue_Basic{
     public static void main(String[] args) {
        Queue <Integer> q1 = new LinkedList<>();

        q1.add(56); q1.add(45); q1.add(18);
        System.out.println(q1);
        System.out.println(q1.size());

        System.out.println(q1.peek());
        System.out.println(q1.remove());
        System.out.println(q1);
        System.out.println(q1.size());
        
     }
    
}