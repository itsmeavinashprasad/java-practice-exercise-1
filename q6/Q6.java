import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);
        
        // prompt
        System.out.print("Input: ");
        String input = sc.nextLine();
        
        // print char type
        if(input.length() != 1){
            System.out.println("Output: Invalid input");
        }
        else{
            char ch = input.charAt(0);
            if(ch >= 'a' && ch <='z'){
                System.out.println("Output: Small Letter");
            }
            else if(ch >= 'A' && ch <='Z'){
                System.out.println("Output: Capital Letter");
            }
            else if(ch >= '0' && ch <='9'){
                System.out.println("Output: Digit");
            }
            else {
                System.out.println("Output: Symbol");
            }
        }
        



        // closing handles
        sc.close();
    }
}