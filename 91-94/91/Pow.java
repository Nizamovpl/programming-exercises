import java.lang.Math; 

public class Pow {
   
    public static void main(String[] args){
        System.out.println(Powers(48)); 
    }

    public static int Powers(int n){

        
        //base case
        if(n == 0) return 1; 

        // pow(0) = 1

        //need to figure out the powers

        // pow(N) = 2*pow(N-1)
        
        //need to think of proper syntax. 
        return 2*Math.pow(n-1); 
    
    }   
}
