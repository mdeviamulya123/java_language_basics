import java.util.Scanner;

class Sum{

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int score = 0;
    int sum = 0;

    System.out.println("Enter numbers here");
    String line = in.nextLine();

    in = new Scanner(line); 
    while (in.hasNextInt()) {
        score = in.nextInt();
        sum += score;
    }
    System.out.println(sum);
}
}