import java.lang.Math; 

public class Cylinder{
        double v; 
        float h; 
        float r; 

    public void volume(){

        v = Math.PI*2*Math.pow(r,2) + Math.PI*2*r*h; 
    }

    public double returnVolume(){

        return v; 
    }


}