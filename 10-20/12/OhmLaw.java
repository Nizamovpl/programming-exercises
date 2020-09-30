import java.util.Scanner; 

public class OhmLaw{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double i;  
        System.out.println("What is the voltage?");
        int v = scanner.nextInt(); 
        System.out.println("What is the resistance");  
        int r = scanner.nextInt(); 
        i = (v+0.0)/r;
        
        System.out.println("The current is" + i); 
    }


}