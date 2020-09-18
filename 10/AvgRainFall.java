import java.util.Scanner;

public class AvgRainFall{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); 
        int may = 0;  
        int april = 0; 
        int june = 0 ; 
        int avgRainFall = (may+april+june)/3; 

        System.out.println("The average value for each of the montsh is " + avgRainFall); 

        System.out.println("Would you like to see the months true/false");
        Boolean yes = scanner.nextBoolean(); 

        if(yes){
            System.out.println("may "+ may + "April" + april + "june" + june); 
        }




    }



}

