package Assignment6;

public class Quest2{

    Quest2() {
        System.out.println("constructor 1 is running. ");
    }
    Quest2(int str) {
        this();
        System.out.println(str);
    }
    public static void main(String[] args) {
        Quest2 obj = new Quest2(5);
    }
}