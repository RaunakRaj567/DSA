
import java.util.Stack;

public class Stack_Q1 {
    public static void main(String[] args) {
        Stack <Integer> stt = new Stack<>();

        for(int i=0;i<28;i=i+2){
            stt.push(i);
        }
        System.out.println(stt);

        System.out.println("New Stack");
// Print 2nd element of stack

while(stt.size()>2){
    stt.pop();

}

System.out.println(stt.peek());
// 2 is answer
        
    }
    
}
