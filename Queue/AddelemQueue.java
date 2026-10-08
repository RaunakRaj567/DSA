import java.util.*;

public class AddelemQueue {

    // WAP to add elem to a given position

    static void addelem(Queue<Integer>q1, int posi , int elem){

        for(int i=1; i<posi; i++){
            q1.add(q1.remove());
        }
        q1.add(elem);

        for(int i=1; i<q1.size()+1-posi; i++){
            q1.add(q1.remove());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();

        for(int i=1;i<6;i++){q.add(i);}

        System.out.println("Orignal queue" + q);

        addelem(q, 4, 6969);

        System.out.println("Modified Queue:" + q);

    }
}
