import java.util.ArrayList;

public class Array{

    //fruits decleration
    ArrayList<String>fruits= new ArrayList<String>(); 
    ArrayList<String>vegetables= new ArrayList<String>(); 
    ArrayList<String>fruitandVeg= new ArrayList<String>(); 
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
       
    }



    //functions
    public void foodSort(){
        
    }

    public void dupedAnimals(){
        //go through the list i times comparing the first one to 2nd to third
        
        for(int i = 0; i<animals.size(); i++){
            //System.out.println(list.get(i)); 

        }




    }

    public void insert(){


    }

    public void reverse(){

    }


}