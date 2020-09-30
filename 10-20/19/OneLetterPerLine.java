import java.util.Scanner; 

public class OneLetterPerLine{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.next();
        
        int fi = word.length(); //final index 
        int i = 0 ; 

        scanner.close(); 

        while (i <= fi){
         System.out.println(word.charAt(i)); 
         i +=1;       
        }
    }



}