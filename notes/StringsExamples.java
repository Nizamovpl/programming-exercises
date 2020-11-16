public class StringsExamples{  
    public static void main(String[] args){
        String s = "This is a string";
        String t = new String("This is a string"); 
        s.length(); ; 
        //             01234
        String game = "baseball";
        if(game.endsWith("ball")){
            //code
        }
        game.indexOf("ball"); //returns 4
        game.indexOf("apple"); //returns -1 

        //1 2 3 4 5 6 7 8
        // b a s e b a l l 
        String sub = "baseball".substring(0,4);
        //labels spaces between words 
        String a = "string"; 
        a.substring(3); 

        String b = "b"; 
        String c = "c";
        
        b.compareTo(c); //1
        c.compareTo(b); //-1
        b.compareTo(b); //0
        
        String one = "1"; 
        String two = "1"; 
        int x = 1; 
        int y = 1; 

        if(one == two){ 
        //false; only true if same memory spot
        //stored in heap

        }

        if(one.equals(two)){
            //true

        }

        if(x == y){
            //true stored in a stack
        }


        //Strings are guaranteed to be immutable
        //Strings are unchangable
    }    
}