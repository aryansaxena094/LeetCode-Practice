import java.util.*;

public class GoalParser {
    public static void main(String[] Args){
        String command = "(al)G(al)()()G";
        String ans = "";
        for(int i = 0; i < command.length(); i++)
        {
            if(command.charAt(i) == '(')
            {
                if(command.charAt(i+1) == 'a')
                {
                    ans = ans + "al";
                    i = i + 3;
                }
                else
                {
                    ans = ans + "o";
                    i = i + 1;
                }
            }
            else
            {
                ans = ans + command.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
