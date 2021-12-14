package CollectionClass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        s1.push(1);
        s1.push(3);
        s1.push(7);
        s1.push(5);
        s1.push(10);

        System.out.println("Popped element from"
                + " stack is " + s1.pop());
        System.out.println("Sum Of all Elements is: " + s1.summer());
    }

}
