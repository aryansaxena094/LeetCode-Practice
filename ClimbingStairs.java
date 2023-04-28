import java.util.*;

public class ClimbingStairs {
    public static void main(String[] Args){
        int n  = 10;
        int fib[] = new int[n+1];
        fib[0] = 1;
        for(int i = 2; i <= n; i++)
        {
            fib[1] = 2;
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(fib[n-1]);
    }
}
