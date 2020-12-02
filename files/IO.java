import java.util.Scanner;
import java.io.*;

public class IO {
    public static void main(String[] args){
        System.out.println("Input/Output Example ");

        File file;
        Scanner scan;

        //try/cash/finally --> we manage it ourselves

        //can do scan has next line
        try {
            file = new File("wrong.csv");
            scan = new Scanner(file);
            String[] letters = scan.nextLine().split(","); 

            for(String letter : letters){
                System.out.println(letter); 
            }

            // while(scan.hasNextInt()){
            //     int num = scan.nextInt();
            //     System.out.println("The next number is " + num); 
            // }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }
    }
}


//go back in git commits, since they have different variants: this one is a retyped version. 
//different ways of doing it. Tis a bit annoying but will do