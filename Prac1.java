import java.util.*;

public class Prac1 {
    public static void main(String[] Args){
        String ques[] = {"Kylie 782", "Aryan 882", "Rohan 992", "Kamal 992"};
        int a = 782;
        for(int i = 0; i < ques.length; i++){

            String current[] = ques[i].split(" ");
            System.out.println(current[0] + " Scoring " + current[1]);
        }
    }
}
