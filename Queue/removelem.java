import java.util.*;

public class removelem {

    static void removelem(Queue<Integer> q1, int posi) {
        int size = q1.size(); /// initialise size at start coz it will change later

        for (int i=1; i<posi; i++) {
            q1.add(q1.remove());
        }

        q1.remove();

        for (int i=0; i<size-posi; i++) {
            q1.add(q1.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i=1; i<6; i++) {
            q.add(i);
        }

        System.out.println("Original queue: " + q);

        removelem(q, 2);

        System.out.println("Modified queue: " + q);
    }
}
