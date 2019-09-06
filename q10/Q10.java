import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1: ");
        String input = sc.nextLine();        
        System.out.print("Input 2: ");
        int n = sc.nextInt();        
        
        
        // output
        System.out.print("Output: " + input);
        for(int i=0; i<n; i++){
            System.out.print(input.substring(input.length()-n, input.length()));
        }
        System.out.println();

        
        // closing handles
        sc.close();
    }
}