import java.util.*;

public class Stack_basic {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <>();

        st.push(5);
        st.push(85);
        for(int i=0;i<23;i=i+2){
            st.push(i);
        }

        System.out.println(st.peek());
        System.out.println(st);
        int a=st.size();
        System.out.println(a);

        while(st.size()>1){
            st.peek();
        }

        System.out.println(st.peek());


        
    }
    
}
