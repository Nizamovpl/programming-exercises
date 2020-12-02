import java.util.Scanner;
import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException{
        // System.out.println("Input/Output Example ");

        // File file;
        // Scanner scan;
        
        PrintWriter output = new PrintWriter(output.md); 

        output.println("my new Data"); 
        Dog dog = new Dog("Spot", "terrier", 10); 
        output.println(dog); 
        output.close(); 

        //try/cash/finally --> we manage it ourselves

        //can do scan has next line
        // try {
        //     PrintWritter = output = new PrintWriter("output.md"); 
        //     file = new File("data.csv");
        //     scan = new Scanner(file);

        //     while(scan.hasNextLine()){
        //         String[] parameters = scan.nextLine().split(","); 
        //         Dog dog = new Dog(parameters[0], parameters[1], Integer.parseInt(parameters[2]));
        
        //         System.out.println(dog);
        //     }

            
        //     // String[] letters = scan.nextLine().split(","); 

        //     // for(String letter : letters){
        //     //     System.out.println(letter); 
        //     // }

        //     // // while(scan.hasNextInt()){
        //     // //     int num = scan.nextInt();
        //     // //     System.out.println("The next number is " + num); 
        //     // // }
        // } catch (Exception e){
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("Done");
        // }
    }
}


//go back in git commits, since they have different variants: this one is a retyped version. 
//different ways of doing it. Tis a bit annoying but will do