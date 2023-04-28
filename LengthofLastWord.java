import java.util.*;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        String l[] = s.split(" ");
        int count = l[l.length-1].trim().length();
        System.out.println(count);
    }
    
}
