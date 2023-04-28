public class trycatch {
    public static void main(String[] args){

        try {
            int y = 0;

            int x = 1 / y;

            // throw newException();
       
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.toString());

        }

        finally{
            System.out.println("test finally");
        }
    }

}
