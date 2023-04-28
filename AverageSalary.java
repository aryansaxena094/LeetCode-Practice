import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;

public class AverageSalary {
    public static void main(String[] Args){
        int salary[] = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        ArrayList<Integer> sal = new ArrayList<Integer>();
        double sum = 0;
        double av = 0;
        for(int i = 0; i < salary.length; i++)
        {
            sal.add(salary[i]);
        }
        Collections.sort(sal);
        for(int i = 1; i < sal.size()-1; i++)
        {
            int n = sal.size()-1;
            sum = sum + sal.get(i);
            av = sum/i;
        }
        System.out.println(av);
    }
}
