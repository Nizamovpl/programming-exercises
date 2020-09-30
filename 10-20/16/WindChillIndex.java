import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        
        //misnamed varliable should be wind chill
        double windSpeed = 0; 

        System.out.println("Enter Wind Speed: ");
        int speed = scanner.nextInt(); 
        System.out.println("Enter Tempurature (°F): ");
        int temp = scanner.nextInt();  

        if(speed < 3|| temp + 50 > speed ){
            windSpeed = (double) temp; 
        }else{
            windSpeed = 35.74 + (0.6215 * (float)temp) - (35.75*Math.pow((float)speed,(float)16)) + (0.4275 * temp * Math.pow((float)speed,(float)16));   
        }; 

        System.out.println("The Wind Chill is:" + windSpeed); 
    }


}