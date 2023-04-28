import java.util.*;

public class LongestPallindrome {
    public static void main(String[] Args){
        String s = "bb";
        ArrayList<String> word = new ArrayList<String>(Arrays.asList(s.split("")));
        Collections.sort(word);
        int count = 0;
        for(int i = 0;i < word.size(); i++)
        {
            String letter = word.get(i);
            word.remove(letter);
            if(word.contains(letter))
            {
                count = count + 2;
                word.remove(letter);
                if(i>2)
                {
                    i = i - 2;
                }
                else
                {
                    i = 0;
                }
            }
            else
            {
                word.add(letter);
                Collections.sort(word);
            }
        }
        if(word.isEmpty() != true)
        {
            count = count+1;
        }
        System.out.println(count);
    }
}
