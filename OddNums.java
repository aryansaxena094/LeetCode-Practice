public class OddNums {
    public static void main(String[] args) {
        int low = 3;
        int high = 7;
        int even1 = low%2;
        int even2 = high%2;
        boolean loweven = false;
        boolean higheven = false;
        int ans = 0;

        if(even1 == 0)
        {
            loweven = true;
        }
        if(even2 == 0)
        {
            higheven = true;
        }

        if(loweven == true)
        {
            if(higheven == true)
            {
                ans = (high-low)/2;
            }
            else
            { 
                ans = (high-low)/2 + 1;
            }
        }
        else
        {
            if(higheven == true)
            {
                ans = (high-low)/2 + 1;
            }
            else
            {
                ans = (high-low)/2 + 2;
            }
        }
        System.out.println(ans);
    }
}
