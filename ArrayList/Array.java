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
        //I blanked on how to initialize lists
        
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
        //sort

    }

    public void dupedAnimals(){ 
        for(int i = 0; i<animals.size(); i++){
            for(int n = 0; n < animals.size(); n++){
                if(animals.get(i).equals(animals.get(n))){
                    animals.remove(n); 
                }
            }

         }

    }

    public void insert(){
        int insert = 5; //insert value
        int leftbound = 0; 
        
        //left bound   
       
        for(int i = num.size(); i < 0; i--){
            if(num.get(i) < insert){
                leftbound = i; 
                break; 
            }

        }

        num.add(leftbound,insert);

        //compare until you see the rightbound int closest to it, and leftbound int and shove it between thsoe two
        //right bound is not needed : for now
    }

    public void reverse(){
        int halfSize = num.size() / 2; 

        for(int i=0;i < halfSize; i++){
            int left = i; 
            int right = num.size() - i;

            int temp = left; 
            left = right; 
            right = temp; 
        }
       //flip the two opposite ones as you get to the middles
        
    }


}