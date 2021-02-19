import java.lang.Math; 

public class LogBase{

    public static void main(String[] args){
        System.out.println(LogBaseTwo(48)); 
    }

    public static double LogBaseTwo(int n){

        if(n == 1) return 0.0; 

        //log(N) = 1 + log(N/2)

        return 1+ Math.log(n/2); 
    
    }  


    
}