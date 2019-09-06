import java.util.Scanner;
import java.util.Arrays;

public class Q9{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);
        
        // prompt
        System.out.print("Input: ");
        String input = sc.nextLine();
        
        // Reverse
        System.out.print("Output: ");
        System.out.println(new StringBuilder().append(input).reverse());


        // closing handles
        sc.close();
    }
}