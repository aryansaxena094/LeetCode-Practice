import java.util.*;

public class ques724 {
    public static void main(String[] Args) {
        int nums[] = {1,7,3,6,5,6};
        int temp1 = 0;
        int temp2 = 0;
        int ans = -1;
        loop1: for(int i = 0; i < nums.length; i++)
        {
            temp1 = temp1+ nums[i];
            for(int j = i ;j < nums.length; j++)
            {
                temp2 = temp2 +nums[j]; 
            }
            if(temp1==temp2)
                {
                    ans = i;
                    break;
                }
            temp2 = 0;  
        }
        System.out.println(ans);
    }
    
}
