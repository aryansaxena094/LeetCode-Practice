import java.util.*;
import java.util.*;
public class reversevowels {
    public static void main(String[] Args){
        String s = "leetcode";
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        ArrayList<Character> q = new ArrayList<Character>();
        String ans = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(vowels.contains(s.charAt(i)))
            {
                q.add(s.charAt(i));
            }
        }
        for(int i = 0; i < s.length(); i++)
        {
            if(vowels.contains(s.charAt(i)))
            {
                ans = ans + q.get(q.size()-1);
                q.remove(q.size()-1);
            }
            else
            {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);

    }
}
