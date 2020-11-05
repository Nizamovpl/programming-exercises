import java.util.Scanner;  

public class MilesPerGallon{
    public static void main(String[] args){
       
        int initialMiles; 
        int finalMiles;
        int gallons; 
        int milesPerGallon;  
        Scanner scanner = new Scanner(System.in);
        String goodbye = "Goodbye!";


        while(true){

            System.out.println("What is your initial amount of miles"); 
            initialMiles = scanner.nextInt();   
            
            if (initialMiles < 0 ){
                System.out.println(goodbye); 
                scanner.close(); 
                System.exit(1);
            }

            System.out.println("Miles Per Gallon: "); 
            milesPerGallon = scanner.nextInt(); 
            System.out.println("Gallons: ");
            gallons = scanner.nextInt(); 
            finalMiles = initialMiles + (milesPerGallon*gallons); 
            System.out.println("final amount of miles is: "+ finalMiles); 

            
            
        }
    }

}