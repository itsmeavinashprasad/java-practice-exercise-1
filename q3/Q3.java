import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);

        // prompt
        System.out.print("-> ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        
        // Vowel or Consonant
        System.out.print("-> ");
        
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch < 'a' || ch > 'z'){
                System.out.println(ch + ": Not a Letter ");
                return;
            }
        }

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                System.out.print("Vowel ");
            }
            else{
                System.out.print("Consonant ");
            }
        }
        System.out.println();


        // closing handles
        sc.close();
    }
}