import java.util.ArrayList;

public class Lists{

    public static void main(String[] args){
        //lists are expandable arrays are not

        //ArrayList list = new ArrayList(); 

        ArrayList<String>list = new ArrayList<String>(); 

        list.add("apple");  //array[0] - apple
        list.add("blueberry"); 
        
        list.get(1); 

        list.set(0,"new word"); 

        //aray.length
        list.size(); 


        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)); 
        }

        //rules
        //only back to front
        //only one at a time

        
        //list.remove("blueberry"); 
        //arrays
        String[] words = {"apple", "blueberry", "cherry"}; 

        String[] word = new String[100]; //cannot change size of list


    }

}