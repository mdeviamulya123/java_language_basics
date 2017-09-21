import java.util.Scanner;

class Pe8{
	
public static void main(String args[])
   {

   int x, randomNum, maximum, minimum;
   maximum=1 ;
   minimum= 100;


   System.out.println("Enter a number");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();

      randomNum = minimum + (int)(Math.random() * maximum); 


if (x== randomNum){
	System.out.println("Match");
}

else if (x> randomNum){
	System.out.println("Morethan");
}

else if (x< randomNum){
	System.out.println("Lessthan");
}


}
}