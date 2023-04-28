import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] Args){
        Scanner sc  =  new Scanner(System.in);
        String s  = sc.nextLine();
        String re = "www";
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(s);
        boolean test = matcher.find();
        System.out.println(test);
    }
}