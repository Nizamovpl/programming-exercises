import java.util.Scanner; 
import java.lang.Math; 

public class LogBaseTwo{
    public static void main(String[] args){
        int x; 
        double y;  
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a value: "); 
        x = scanner.nextInt(); 
        y = Math.log(x)/Math.log(2);
        System.out.println("The log base two is: " + y);  

    }

}