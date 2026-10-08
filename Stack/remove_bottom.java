
import java.util.Stack;

public class remove_bottom {
    static void bottom(Stack<Integer> st1,int s){
        Stack <Integer> temp = new Stack<>();

        while(st1.size()>1){
            temp.push(st1.pop());
        }

        st1.pop();

        while(!temp.isEmpty()){
            st1.push(temp.pop());
        }


    }
    public static void main(String[] args) {
        Stack <Integer> st1 = new Stack<>();

        for (int i=0;i<27;i=i+2){
            st1.push(i);
        }

        System.out.println("Stack 1 is:");
        System.out.println(st1);

        bottom(st1, 6);

        System.out.println(st1);
    }
    
}
