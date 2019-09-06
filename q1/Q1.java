import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);

        // prompt
        System.out.print("-> ");
        String input = sc.nextLine();
        
        // palindrome
        int i=0; 
        int j = input.length()-1;
        int sum = 0;
        boolean isPalindrome = true;
        while(j>=i){
            if(input.charAt(i) != input.charAt(j)){
                isPalindrome = false;
            }
            i++; j--;
        }

        // sum of even
        i = 0;
        while(i<input.length()){
            int x = (int)input.charAt(i) - 48;
            if(x%2 == 0)
                sum += x;
            i++;
        }

        // output
        System.out.print("-> " + input);
        if(isPalindrome){
            System.out.print(" is a palindrome");
            if(sum > 25)
                System.out.println(" and sum of even numbers is greater than 25 ");
            else if(sum == 25)
                System.out.println(" and sum of even numbers is equal to 25 ");
            else
                System.out.println(" and sum of even numbers is lesser than 25 ");
        }
        else{
            System.out.println(" is not a palindrome");
        }




        // closing handles
        sc.close();
    }
}