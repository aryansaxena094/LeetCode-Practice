public class CountOdds {
    public static void main(String[] Args){
        int low = 7; int high = 10;
        float count = 0;
        count = high/2 - low/2;
        // Math.round(count);
        if(count > (int)count)
        {
            count = count+1;
        }
        System.out.println(count);
    }
}
