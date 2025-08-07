import java.util.*;
public class Petya_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int cmp = s1.compareToIgnoreCase(s2);

        if(cmp==0){
            System.out.println("0");
        }
        else if(cmp>0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}
