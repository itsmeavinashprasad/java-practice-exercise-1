import java.util.Scanner;
import java.util.Arrays;

public class Q7{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);
        
        // prompt
        System.out.print("Input: ");
        String input = sc.nextLine();
        System.out.print("Output: ");
        
        // sort descending order
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        System.out.println("\t Sorted Number is non-increasing order: " + new StringBuilder().append(arr).reverse());

        // Sum of even
        int sum = 0;
        for(int i=0; i<input.length(); i++){
            int num = (int)arr[i] - 48;
            if( num % 2 == 0){
                // even
                sum += num; 
            }
        }
        System.out.println("\t\t Sum of even Numbers: " + sum );

        // true/false
        System.out.print("\t\t ");
        System.out.println( (sum>15) ? "True" : "False");


        // closing handles
        sc.close();
    }
}