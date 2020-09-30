import java.util.Scanner; 

public class CorrectChange{
    public static void main(String[] args){
        int cents; 
        int dollars =0;
        int quarters = 0;  
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("How many cents do you have?");
        cents = scanner.nextInt(); 

        //dollars
        while(cents >100){ 
            cents = cents-100;  
            dollars = dollars+1; 
        }
        //quarters
        while (cents > 25){
            cents = cents-25; 
            quarters = quarters + 1; 
        }
        //dimes
               
        //I have a feeling I might be faulty with logic 
        //I'll check later

    }



}