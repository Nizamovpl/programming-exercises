public class Box{

    public int width,height,length; 
    private int area; 
    private int volume; 

    public Box(int width, int height, int length){
        this.width = width; 
        this.height = height; 
        this.length = length; 

    }

    public int volume(){
        volume = length * width * height; 
        return volume;   
    }

    public int area(){
        area = 2*(length*width) + 2*(height*length) + 2*(width*height);
        return area;    
    }

   
}

