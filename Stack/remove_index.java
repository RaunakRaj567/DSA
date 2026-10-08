import java.util.*;

public class remove_index {
    static void index_remov(Stack<Integer> st1,int s){
        Stack <Integer> temp = new Stack<>();

        while(st1.size()>s){
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

        index_remov(st1, 4);

        System.out.println(st1);
    }

    
}
