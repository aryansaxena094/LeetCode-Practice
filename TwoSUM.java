import java.util.*;

public class TwoSUM {
    public static void main(String[] args) {
        int nums[] = {3,3};
        int target = 6;
        int ans[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++)
        {
            int second = target - nums[i];

            if(map.containsKey(second) && map.get(second)!=i)
            {
                ans[0] = i;
                ans[1] = map.get(second);
            }
        }
        System.out.println(ans[0]+","+ans[1]);
    }
    
}
