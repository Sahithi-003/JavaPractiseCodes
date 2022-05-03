import java.util.Locale;
import java.util.Scanner;

public class AllAlphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        boolean flag = true;
        for(char c='a';c<='z';c++){
            if(!str.contains(String.valueOf(c))){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("String contains all alphabets");
        }
        else{
            System.out.println("String doesn't contain all alphabets");
        }
    }
}

