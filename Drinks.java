import java.util.*;

public class Drinks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }

        double total = n*100;
        double average = sum/total;
        System.out.println(average*100);

        
    }
}