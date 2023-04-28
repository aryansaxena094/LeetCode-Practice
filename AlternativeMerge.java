import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class AlternativeMerge {
    public static void main(String[] Args){
        String word1 = "abcd"; 
        String word2 = "pq";
        String ans = "";
        int len = word1.length()+word2.length();
        for(int i = 0 ; i < len; i++)
        {
            if(i < word1.length())
            {
                ans = ans + word1.charAt(i);
            }
            if(i < word2.length())
            {
                ans = ans + word2.charAt(i);
            }
        }
        System.out.println(ans);
        
    }
}
