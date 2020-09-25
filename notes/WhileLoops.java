import java.util.Scanner; 

public class WhileLoops{

    public static void main(String[] args){
        //countable/ predictable

        int count = 0; 
        while (count < 10){
            System.out.println(count); 
            count = count + 1; 
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password"); 
        String password = scanner.next(); 
        
        //uncountable
        while (!password.equals("password")){
            System.out.println("Enter Password"); 
            password = scanner.next(); 
        }


        //always runs the code in the entire block
        //control c will stop any program that is running ; if an infinite loop occurs
        //avoid while(true){} unless it is intentional

        //scope - if it is in the block of code of the loop, then it's only private in that section; 
        //and won't run in main
        //variable ++

        scanner.close(); 

    }



}