import java.util.*;
public class plusone {
    public static void main(String[] args) {
        int[] digits = {3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        String a = Arrays.toString(digits).replaceAll("\\W+", "");
        long n = Long.parseLong(a);
        n = n+1;
        a = Long.toString(n);
        String str[] = a.split("");
        int[] ans = new int[str.length];
        for(int i = 0; i < ans.length; i++)
        {
            ans[i] = Integer.parseInt(str[i]);
            System.out.print(ans[i]+",");
        }
    }
}
