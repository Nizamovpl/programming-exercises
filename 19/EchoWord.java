import java.util.Scanner; 

public class EchoWord{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a word: "); 
        String inputString = scanner.next();
        int times = inputString.length(); 
        scanner.close(); 

        while (times > 0){
          System.out.println(inputString); 
          times = times-1;   
        }
    }
}