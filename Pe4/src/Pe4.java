import java.util.Scanner;

    public class Pe4{
        
       
        public static void main(String[] args)

        {

            Scanner in=new Scanner(System.in);
        System.out.println("Enter an Integer");
        boolean validInput = false;
        


while(!validInput) {
        int n=in.nextInt();
       
        int i, j;

            for( i = 1; i <= n; i++)

            {
                  for (j=1; j<=i; j++)

{
  System.out.println(i);
   
}
               
            }

           

        }
    

    }
}
    