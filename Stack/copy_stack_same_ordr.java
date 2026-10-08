import java.util.*;

public class copy_stack_same_ordr {

    static void copy(Stack <Integer> st1,Stack <Integer> st2){

        Stack <Integer> temp = new Stack<>();

        while(!st1.isEmpty()){
            temp.push(st1.pop());
        }

        while(!temp.isEmpty()){
            st2.push(temp.pop());
        }
      

    }
    public static void main(String[] args) {
        Stack <Integer> st1 = new Stack<>();

        for (int i=0;i<27;i=i+2){
            st1.push(i);
        }

        System.out.println("Stack 1 is:");
        System.out.println(st1);

        Stack <Integer> st2 = new Stack<>();

        copy(st1, st2);

        System.out.println("Copied Stack is: ");
        System.out.println(st2);
    }
    
}
