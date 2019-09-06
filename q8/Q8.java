import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);
        
        
        
        // hint
        int min = 50;
        int max = 100;
        boolean cond = false;
        while(!cond){

            // prompt
            System.out.print("Input: ");
            int x = sc.nextInt();
            
            // logic
            if(x >= min && x<= max){
                // right
                cond = true;
                System.out.println("Correct: Number guessed matches the original number");
            }
            else if( x < min){
                // less
                System.out.println("Hint: Number guessed is less than original number");
            }
            else{
                // greater
                System.out.println("Hint: Number guessed is more than original number");
            }
        }

        
        // closing handles
        sc.close();
    }
}