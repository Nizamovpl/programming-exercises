import java.util.Arrays; 
import java.util.ArrayList;

public class Search{

    public static void main(String[] args){
        
        String[] fruits = {"banana", "cherry"}; 

        Arrays.sort(fruits); 

        for(String f: fruits){
            System.out.println(f); 
        }

        System.out.println(indexOfRecusive("banana"), fruits)
        indexOf("banana", fruits); 
    }

    public static int indexOf(String needle, String[] hayStack){
        for(int i = 0; i< hayStack.length; i++){
            if(hayStack[i].equals(needle)){
                return i; 
            }
        }

        return -1; 

    }

    public static int indexOfRecusive(String needle, String[] hayStack){
        return indexofWithStartEnd(needle,hayStack,0,hayStack.length-1) 
    }

    private static int indexofWithStartEnd(String needle, String[] hayStack){
        int end = hayStack.length(); 
        int start = 0; 
        int mid = (end-start)/2; 
        
        if(hayStack[mid].equals(needle)) return mid; 

        if(end <= start) return -1; 
        
        //a.compareTo(b) = returns whether they are in order
        
        if(hayStack[mid].equals(needle)) return mid;
        if(hayStack[mid].compareTo(needle) == 1){
            return indexofWithStartEnd(needle, hayStack,mid,end); 
        }else{
            return indexofWithStartEnd(needle, hayStack,start,mid);
        }


        //Had a headahche started to screenshot there
        public static ArrayList<String> merge(ArrayList<String>, a, ArrayList<String> b){

        }
    }

}