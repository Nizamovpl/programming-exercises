import java.util.Scanner;

public class AgeInSeconds{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        //why do we have to specify system.in, is there another way??
        long years; 
        long months;
        long days; 

        System.out.println("What is your age in years?");
        years = scanner.nextLong(); 
        System.out.println("How many months passed since your birthday?");
        months = scanner.nextLong();
        System.out.println("How many days passed since the last whole month?");
        //how do I word the last one?
        days = scanner.nextLong();
        
        //here would be where an if then statement goes to prevent 10^6 year olds; 


        //need to account for leap years at one point w/ function; would have to now birth tear
                            //365 is temp year placement
        long yearsec = years*(365*24*60*60);
        //need a function for months for 31 vs 30 ; array probably
        long monthsec = months*(31*24*60*60); 
        long daysec = days*(24*60*60);
        
        long seconds = yearsec + monthsec + daysec; 
        
        System.out.println("Your somewhat accurate age in seconds is: "+ seconds);
        //only somewhat until I have time to add accuracy to the code and more if thens, etc.  


    }


}; 