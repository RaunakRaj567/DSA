

import java.util.Stack;

public class rev_array {
    public static void rev_arr(int [] arr){
        Stack <Integer> temp = new Stack<>();

        for(int i=0;i<arr.length;i++){
            temp.push(arr[i]);
        }

       for(int i=0;i<arr.length;i++){
        arr[i]=temp.pop();
        }

        
    }
    public static void main(String[] args) {
        int [] arr = {45,36,74,96,-98,-74,100};

        for( int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        rev_arr(arr);

        for (int x: arr){
            System.out.print(x+" ");
        }


    }
    
}
