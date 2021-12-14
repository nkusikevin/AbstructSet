package CollectionClass;

import java.util.ArrayList;

public class Stack {
    int arr[];
    int top = -1 ;
    int size ;

    Stack(int size){
        this.size = size;
        arr = new int[size];
    }

    void push (int X){
        if (top+1 == size){
            System.out.print("Stack in in overFlow");
        }else {
            top= top+1;
            arr[top] = X;
        }
    }

   public int pop( ){
        if (top == -1){
            System.out.print("Stack is in underflow state");
        }else
        {
            int x = arr[top];
            top--;
            return x;
        }
        return 0;
    }

    public int summer(){
        int []cop = new int[this.size];
        int sum = 0;
        System.arraycopy( arr, 0 ,cop ,0,this.size);
        for (int i=0; i<cop.length ; i++){
           sum = sum + cop[i];
        }
        return sum;
    }
}
