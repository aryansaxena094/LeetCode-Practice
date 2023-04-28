import java.util.*;

public class OrderlyQueue {
    public static void main(String[] Args){
        int n  = 0;
        int fib[] = new int[n+1];
        fib[0] = 0;
        for(int i = 2; i <= n; i++)
        {
            fib[1] = 1;
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(fib[n]);
    }
}
