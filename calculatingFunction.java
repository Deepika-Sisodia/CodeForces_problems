import java.util.Scanner;

public class calculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // int fn = 0;
        // // for(int i=1; i<=n; i++){
        // //     fn = fn + ((int) Math.pow(-1, i))*i;
        // // }

        // // System.out.println(fn);

        // System.out.println(fun(n));

        long result = 0;
        if(n%2==0){
            result = n/2;
        }
        else{
            result = ((n+1)/2);
        }

        System.out.println(result);

    }

    // public static int fun(int n){
    //     if(n==1){
    //         return -1;
    //     }

    //     int fn = fun(n-1) + ((int) Math.pow(-1, n))*n;
    //     return fn;
    // }
}
