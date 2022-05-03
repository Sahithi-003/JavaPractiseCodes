package sahithi.assignment.main;

import sahithi.assignment.data.Assignment5;
import sahithi.assignment.singleton.Assignment5_2;

public class Main {
    public static void main(String[] args){
        Assignment5 obj = new Assignment5();
        obj.print();
        // obj.print1();
        Assignment5_2 obj1 = new Assignment5_2();
        obj1.method("Hi!");
    }
}
