
import java.util.Stack;

public class stack_rev {
    public static void main(String[] args) {
        Stack <Integer> stt = new Stack<>();
        Stack <Integer> stt_revv = new Stack<>();

        for(int i=0;i<11;i++){
            stt.push(i);
        }

        System.out.println("The orignal Stack.");
        System.out.println(stt);

        while(stt.size()>0){
            stt_revv.push(stt.pop());
        }
        System.out.println("Reversed Stack");
        System.out.println(stt_revv);
    }
    
}
