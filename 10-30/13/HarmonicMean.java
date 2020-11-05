// H = 2 / ( 1/X + 1/Y )
import java.util.Scanner; 

public class HarmonicMean{
    public static void main (String[] args){
       int x; 
       int y;
       double h;  
       double m; 
       //I might go back and test doubles later and change types for accuracy

       //make the code resistant to change. If elements were to change. 
       //anticipate problems
       //if someone changes the code; then it shou;d stay
       Scanner scanner = new Scanner(System.in); 
       System.out.println("X: ");
       x = scanner.nextInt(); 
       System.out.println("Y: ");
       y = scanner.nextInt();
       
       scanner.close(); 

       m = (x+y+0.0)/2;  
       h = (double)2/(1/x+1/y); 
       System.out.println("The Harmonic Mean: " + h); 
       System.out.println("The Mean: " + m); 
    }    
}