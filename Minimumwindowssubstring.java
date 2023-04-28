import java.util.*;

public class Minimumwindowssubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        ArrayList<String> t1 = new ArrayList<String>(Arrays.asList(t.split("")));
        String ans = "";
        String finalans = "";
        int count = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++)
        {
            if(t1.contains(""+s.charAt(i)))
            {
                ans = ans + s.charAt(i);
                t1.remove(""+s.charAt(i));
                for(int j = i+1; j < s.length(); j++)
                {
                    if(t1.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        ans = ans + s.charAt(j);
                        if(t1.contains(""+s.charAt(j)))
                        {
                            t1.remove(""+s.charAt(j));
                        }
                    }        
                }
                if(t1.isEmpty())
                {
                    if(ans.length()<count)
                    {
                        finalans = ans;
                        count  = ans.length();
                    }
                    t1.addAll(Arrays.asList(t.split("")));
                }
                else
                {
                    t1.clear();
                    t1.addAll(Arrays.asList(t.split("")));
                }
                ans = "";   
            }
        }
        System.out.println(finalans);
        sc.close();
    }   
}
