import java.lang.Math; 

public class Cone{
    
    double s; 
    double r; 
    double h ; 

    public double slantHeight(){
           r = Math.pow(r,2);
           s = Math.pow(s,2);
           
           h = sqrt(r+s); 


            return h; 

    }

}