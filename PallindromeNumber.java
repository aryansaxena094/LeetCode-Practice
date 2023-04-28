import java.util.*;

public class PallindromeNumber {
    public static void main(String[] args) {
        int x = 101;
        String s = Integer.toString(x);
        boolean ans = true;
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(s.split("")));
        ArrayList<String> b = new ArrayList<String>(Arrays.asList(s.split("")));
        Collections.reverse(b);
        for(int i = 0; i < a.size(); i++)
        {
            if(a.get(i).equals(b.get(i)) == false)
            {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
