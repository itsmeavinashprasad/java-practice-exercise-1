import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        
        // declartion 
        Scanner sc = new Scanner(System.in);

        // prompt
        System.out.print("-> ");
        int input = sc.nextInt();
        
        // between 20 and 30
        if( input >= 20 && input <= 30){
            if(input%2 == 0){
                System.out.println("-> Jerry");
            }
            else{
                System.out.println("-> Tom");
            }
        }
        else{
            System.out.println("-> Does not exists between 20 and 30");
        }


        // closing handles
        sc.close();
    }
}