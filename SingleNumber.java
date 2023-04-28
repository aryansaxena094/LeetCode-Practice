import java.util.*;

public class SingleNumber {
    public static void main(String[] Args){
        int nums[] = {1};
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i = i + 2 ){
            if(i == nums.length-1){
                ans = nums[i];
                break;
            }
            if(nums[i] != nums[i+1])
            {
                ans = nums[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
