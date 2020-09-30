import java.util.Scanner; 

public class RunOfIntegers{
    
    public static void main(String[] args){
        int start; 
        int end; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your starting integer");
        start = scanner.nextInt(); 
        System.out.println("What is your ending integer");
        end = scanner.nextInt();  

        System.out.println(start);
        while(end >= start){
            start += 1; 
            System.out.println(start); 
        }
        System.out.println(end);

        scanner.close();
    }
}