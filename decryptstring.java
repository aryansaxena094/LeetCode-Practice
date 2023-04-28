import java.util.*;

public class decryptstring {
    public static void main(String[] Args){
        String s = "1326#";
        String str = "0abcdefghijklmnopqrstuvwxyz";
        String ans = "";        
        for(int i = (s.length()-1); i >= 0; i--)
        {
            int temp = 0;
            if(s.charAt(i) == '#')
            {
                String temp1 = s.charAt(i-2)+""+s.charAt(i-1);
                temp = Integer.parseInt(temp1);
                i = i-2;
            }
            else
            {
                temp = Integer.parseInt(""+s.charAt(i));
            }
            ans = str.charAt(temp) + ans;
        }
        System.out.println(ans);
    }
}
