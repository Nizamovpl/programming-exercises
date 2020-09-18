import java.util.Scanner; 

public class CentToDollar{  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cents;  
        int dollars = 0; 
        int quarters = 0; 
        int dimes = 0; 
        int nickles = 0; 
        System.out.println("What is the amount of cents you have?");
        cents = scanner.nextInt(); 

        if (cents > 100) {
            while(cents > 100){
                dollars += 1; 
                cents = cents - 100; 
            }
    
        }
        
        if (cents > 25){
            while(cents > 25){
                quarters += 1; 
                cents = cents - 25; 
            } 
        }

        if (cents > 10){
            while(cents > 10){
                dimes += 1; 
                cents = cents - 10; 
            } 
        }

        
        if (cents > 10){
            while(cents > 10){
                dimes += 1; 
                cents = cents - 10; 
            } 
        }

        
        if (cents > 5){
            while(cents > 5){
                nickles += 1; 
                cents = cents - 10; 
            } 
        }
        

        //need to finish print statement. if then statements can be
        //incorperated later to parse all of the unessesary things. 

        System.out.println("Dollars: " + dollars + "/n Quarters: "+ quarters + "/n Dimes: " + dimes + "/n nickels" + "pennies" + cents) 


    }


}

