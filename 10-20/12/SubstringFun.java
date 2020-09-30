import java.util.Scanner; 

public class SubstringFun{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        int begin;
        int end;  
        String sub; 
        String string; 
        System.out.println("Enter Beginning index"); 
        begin = scanner.nextInt(); 
        System.out.println("Enter End index");
        end = scanner.nextInt(); 
        System.out.println("Enter String");
        string = scanner.next(); 
        //add precautions against people entering more than value
        //at a later date, maybe this weekend. But it's done :D
        sub = string.substring(begin, end);  
        System.out.println(sub); 
    }


}
