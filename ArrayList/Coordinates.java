public class Coordinates {
   
    private double x, y; 
      
    ArrayList<Integer>coords= new ArrayList<Integer>(); 

   public void setCoords(double x, double y){
        this.x = x; 
        this.y = y; 
   }

   public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void doubledUp(){
        //I know the logic put one bracket ( on every n and a ) on every n+1
    }

    public void midPoint(){
        //get the index of the last one then insert two, and push over
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }


}



//Design a new class that represents a point in 2d space.
// Then, given a list of floating point numbers, create a new list of points from each adjacent pair of numbers in that list. For example:

// [0, 1 , 2, 3] with length 4, holding integers
// becomes
// [(0, 1), (2, 3)] with length 2, holding Points
// Given a list of points, in between each pair of points insert the midpoint of those two points
// [(0, 1), (2, 3), (2, 5)]
// becomes
// [(0, 1), (0.5, 2), (2, 3), (2, 4), (2, 5)]
// Given a list of points, sort them by proximity to the origin