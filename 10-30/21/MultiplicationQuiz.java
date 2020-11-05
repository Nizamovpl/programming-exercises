import java.util.Scanner;
import java.util.Random; 
public class MultiplicationQuiz{
    
    public static void main(String[] args){
        
        Random random = new Random(); 

        
        int userAns; 
        int compAns;
        int correct = 0 ; 

        int num1 =random.nextInt(30);  
        int num2 = random.nextInt(30); 

        int i = 0 ; 
        Scanner scanner = new Scanner(System.in); 
        
        while(i < 10){

            System.out.println("What is: " + num1 + "*" + num2 + "?"); 
            userAns = scanner.nextInt();  
            compAns = num1*num2;  

            if(userAns == compAns){
                System.out.println("correct"); 
                correct += 1; 
            }else{
                System.out.println("incorrect"); 
            }

            num1 =random.nextInt(30);  
            num2 = random.nextInt(30); 

           
            i += 1;
        }

        scanner.close(); 

        System.out.println("You got " + correct + "out of 10"); 

    }



}