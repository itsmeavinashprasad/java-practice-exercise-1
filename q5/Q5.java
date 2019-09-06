import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);
        
        // prompt
        System.out.print("Input: ");
        String input = sc.nextLine();
        Scanner scInput = new Scanner(input);
        
        // print Sum
        int sum = 0;
        while(scInput.hasNextInt()){
            sum += scInput.nextInt();
        }
        if(scInput.hasNext()){
            System.out.println(scInput.next() + " is not a number");
        }
        else{
            System.out.println( "Output: " + sum);
        }


        // closing handles
        sc.close();
    }
}