import java.util.Scanner;

public class NewtonsMethod{

    public static void main(String[] args){
        double xPrime; 
        double x; 
        double b; 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("What is number do you want to divide?");
        b = scanner.nextInt();  
        int i = 0; 

        if (b == 0){
            System.out.println("The value is undefined"); 
            System.exit(1); 
        }else if(b > 50){
            System.out.println("The value is too large"); 
            System.exit(1);

        }else if (b < 0){
            System.out.println("The value is too small"); 
            System.exit(1); 
        }

        System.out.println("What is your guess"); 
        x = scanner.nextInt();

        while(i < 10){
            xPrime = x*(2-b*x);
            System.out.println(); 

            while (i < 10){
                xPrime = x; 

                System.out.println("What is your guess"); 
                x = scanner.nextInt();

                xPrime = x*(2-b*x);
                i += 1; 


            }

            System.out.println("Your final estiamte is" + xPrime); 

       

        }



    }


}