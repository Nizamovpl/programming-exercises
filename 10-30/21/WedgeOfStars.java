import java.util.Scanner; 

public class WedgeOfStars{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a number: "); 
        int numStars = scanner.nextInt();
        scanner.close(); 
        int i = 0; 

        while (numStars > 0){ //loop for number of stars
            while (i < numStars){ //some way to print it out n times
                System.out.print("*"); 
                i += 1; 
            }
            numStars -= 1; 
            i = 0; 
            System.out.println("\n"); 
        }


    }



}