import java.util.ArrayList;

public class Array{

    //fruits decleration
    ArrayList<String>fruits= new ArrayList<String>(); 
    ArrayList<String>vegetables= new ArrayList<String>(); 
    //animals decleration
    ArrayList<String>animals= new ArrayList<String>(); 
    //int decleration
    ArrayList<Integer>num= new ArrayList<Integer>(); 

    public static void main(String[] args){ 
    }

    //setters for the lists
    public void setAnimals(){
        animals.add("cow"); 
        animals.add("cow"); 
        animals.add("dog"); 
        animals.add("cow"); 
        animals.add("turtle"); 
        animals.add("pig");
        animals.add("sheep");
        animals.add("cheese grater");
        animals.add("fox");    
        animals.add("turtle"); 
    }

    public void setFruits(){
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("oranges");
        fruits.add("dragonfruit");
        fruits.add("passionfruit");
        fruits.add("blueberries");  
    }

    public void setVegtables(){
        vegetables.add("carrot");
        vegetables.add("spinach");
        vegetables.add("beets");
        vegetables.add("carrot"); 
        vegetables.add("carrot");
    }



    //functions
    public void foodSort(){
        ArrayList<String>fruitandVeg= new ArrayList<String>(); 

        fruitandVeg.addAll(vegetables);
        fruitandVeg.addAll(fruits);

        //return them later

    }

    public void dupedAnimals(){
        //go through the list i times comparing the first one to 2nd to third
        
        for(int i = 0; i<animals.size(); i++){
            //System.out.println(list.get(i)); 

        }

    }

    public void insert(){
        //compare until you see the rightbound int closest to it, and leftbound int and shove it between thsoe two
    }

    public void reverse(){

    }


}