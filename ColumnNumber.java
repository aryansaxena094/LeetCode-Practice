import java.util.*;
public class ColumnNumber {
    public static int recur(int temp, int columnNumber, String l)
    {
        temp = columnNumber/l.length();
        return temp;
    }
    public static void main(String[] args) {
        int columnNumber = 701;
        String l = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int temp = columnNumber/l.length();
        String ans = "";
        while(temp > 26)
        {
            temp = recur(temp,columnNumber,l);
            ans = ans + l.charAt(temp);
        }
        int temp2 = columnNumber%l.length();
        ans = ans + l.charAt(temp2);
        System.out.println(ans);
    }
}
