import java.util.*;

public class sixtynine {
    public static void main(String[] args) {
        int num = 9669;
        String ans = "";
        String[] s = Integer.toString(num).split("");
        for(int i = 0; i < s.length; i++)
        {
            if(s[i].equals("6"))
            {
                s[i] = "9";
                break;
            }
        }
        for(int i = 0; i < s.length; i++)
        {
            ans = ans + s[i];
        }
        num = Integer.parseInt(ans);
        System.out.println(ans);
        
    }
}
