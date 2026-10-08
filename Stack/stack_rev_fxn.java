
import java.util.Stack;

public class stack_rev_fxn{

    public static void rev_stack(Stack<Integer> stt){
        Stack <Integer> temp = new Stack<>();
        while(!stt.isEmpty()){
            temp.push(stt.pop());
        }

        System.out.println(temp);

    }
    public static void main(String[] args) {
        Stack <Integer> sttt = new Stack<>();

        for(int i=0;i<17;i=i+2){
            sttt.push(i);

        }

        rev_stack(sttt);

        
    }
    
}