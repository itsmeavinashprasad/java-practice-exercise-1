import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);

        // prompt
        System.out.print("-> ");
        int input = sc.nextInt();
        
        // print pattern
        for(int i=1 ; i<=input; i++){
            for(int j=1; j<=i; j++){
                System.out.print( i + " " );
            }
        }
        System.out.println();


        // closing handles
        sc.close();
    }
}