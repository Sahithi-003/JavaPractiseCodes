package Assignment6;

class Quest3 {

    Quest3(String str) {
        System.out.println(str);
    }

};
public class Quest3_4 {

    public static void main(String[] args) {
        Quest3[] obj=new Quest3[2];
        obj[0]=new Quest3("Hi");
        obj[1]=new Quest3("You there!");
    }
}
