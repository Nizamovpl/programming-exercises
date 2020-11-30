import java.util.Scanner;
import java.io.*; 

public class IO{

    public static void main(String[] args) throws IOException, FileNotFoundException{
        System.out.println("Input/Output example"); 
        

        // try{
        //   file = new File(wrong.csv); 
        //   scan = new File(file);   
        // }catch(IOExeption e){
            //System.out.println("error");
            //System.exit(0);  
        //}catch(FileNotFound e){
            //System.exit(0);  
        //}catch(Exeption e){
            //System.exit(0);  

        //}

        //exeption is an object, that deals with exactly gonna happen
        File file = new File("data");
        //exeption - more sepcific expeption --> IO exeption
        Scanner scanner = new Scanner(file);  
        //throws = can't handle code
        //trycatch statement = we manage it ourself. 

        int num = scanner.nextInt(); 
        System.out.println("The first number is" + num); 
    }

}