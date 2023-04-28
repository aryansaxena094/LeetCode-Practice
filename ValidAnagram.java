import java.util.*;
public class ValidAnagram {
    public static void main(String[] Args)
    {
        String s = "anagram"; 
        String t = "nagaram";
        String s1[] = s.split("");
        String t1[] = t.split("");
        Arrays.sort(s1);
        Arrays.sort(t1);
        boolean ans = true;
        if(s1.length != t1.length)
        {
            ans = false;
        }
        else
        {
            for(int i = 0; i < t1.length; i++)
            {
                if(s1[i].equals(t1[i]) != true)
                {
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
