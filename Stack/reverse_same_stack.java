
import java.util.Stack;

public class reverse_same_stack {
   static void Rev(Stack <Integer> st1){
        Stack <Integer> temp1 = new Stack<>();
        Stack <Integer> temp2= new Stack<>();

        while(!st1.isEmpty()){
            temp1.push(st1.pop());
        }
        while(!temp1.isEmpty()){
            temp2.push(temp1.pop());
        }

        while(!temp2.isEmpty()){
            st1.push(temp2.pop());
        }

    }
    public static void main(String[] args) {
        Stack <Integer> st1 = new Stack<>();
        for (int i=0;i<27;i=i+2){
            st1.push(i);
        }
        System.out.println("Stack 1 is:");
        System.out.println(st1);
        Rev(st1);
        System.out.println(st1);
    }
    
}
