// Write a program that adds up integers that the user enters. 
//First the programs asks how many numbers will be added up.
//Then the program prompts the user for each number. 
//Finally it prints the sum.

// How many integers will be added:
// 5
// Enter an integer:
// 3
// Enter an integer:
// 4
// Enter an integer:
// -4
// Enter an integer:
// -3
// Enter an integer:
// 7
import java.util.Scanner; 

public class AddUpInts{

    public static void main(String[] args){
        int nums[]; 
        int times;
        int i = 0; 

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter an amount of times: ");
        times = scanner.nextInt(); 

        while( i < times){
            System.out.println("enter aditional int"); 
            i += 1; 
            //push ints arrays
        }

        //add function

        //or if thay doesn't work, do a loop where you add along
        //but I want to try this
        scanner.close();  


    }




}