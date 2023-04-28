import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEST2 {
    public static void main(String[] Args) {
        Scanner sc  =  new Scanner(System.in);
        // int n = Integer.parseInt(sc.nextLine());
        // String[] dictionary = new String[n];
        String[] words = new String[2];
        // for(int i = 0; i < n; i++)
        // {
        //     dictionary[i] = sc.nextLine();
        // }

        for(int i = 0; i < 2; i++)
        {
            words[i] = sc.nextLine();
        }

        for(int i = 0; i < 2; i++)
        {
            String current = words[i];
            String re = "ar";
            Pattern pat = Pattern.compile(re);
            Matcher mat = pat.matcher(current);
            boolean a = mat.find();
            System.out.println(a);
        }
        
    }
    
}
