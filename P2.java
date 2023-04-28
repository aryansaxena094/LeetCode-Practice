import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {
        String[] A = {"0-0","0-1","0-2","0-3","0-4","0-5","0-6"};
        ArrayList<Integer> sums = new ArrayList<Integer>();
        String ans = "0-0";
        for(int i = 0; i < A.length; i++){
            String cur[] = A[i].split("-");
            if(cur.length>1)
            {
                int c1 = Integer.parseInt(cur[0]);
                int c2 = Integer.parseInt(cur[1]);
                int cursum = (int) Math.abs(c1 + c2);
                if(sums.contains(cursum)!=true){
                    sums.add(cursum);
                }
            }
        }
        for(int i = 0; i <= sums.size(); i++){
            if(sums.contains(i)!=true){
                int nothere = i;
                if(nothere>6){
                    nothere = nothere-6;
                    ans = nothere+"-"+"6";
                }
                else
                {
                    ans = "0"+"-"+nothere;
                }
                break;
            }
        }
        System.out.println(ans);
    }
}
