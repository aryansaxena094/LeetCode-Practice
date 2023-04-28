import java.util.*;

public class ques205 {
    public static void main(String[] Args){
        String s = "acb";
        String t = "ahbgdc";
        boolean a = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            String sc = ""+s.charAt(i);
            if(t.contains(sc))
            {
                count++;
                t = t.substring(t.indexOf(sc), t.length());
            }
        }
        if(count == s.length())
        {
            a = true;
        }
        System.out.println(a);
    }
}
