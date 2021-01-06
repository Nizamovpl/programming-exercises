public class ArrayPractice{
    int data[] = {1,8,5,3};
    
    public static void main(String[] args){
       
       
    }

    //int data[] = {1,8,5,3};

    public static void swapEnds(int[] data){
         int length = data.length; 
         
         int a = data[0]; 
         int b = data[length]; 

        data[0] = b;
        data[length] = a;  

    }

    public static void hasSeven(int[] data){
        int hasSeven = 0; 
        for(int num:data){ 
            if(num==7){
                hasSeven++; 
            }
        }
        System.out.println("Num 7: " + hasSeven); 
   }

   public static double mean(int[] data){
        int length = data.length; 
        int total = 0; 
        int i = 0; 

        while(i < length){
            total += data[i]; 
            i++; 
        }

       return (double)total/length; 
   }
    
   public static void reverse(int data[]){
        int length = data.length; 
        
        int[] revdata = new int[length]; 

        int i = length; 
        int j = 0; 
        while(i > 0){

            revdata[j] = data[i]; 
            i = i-1; 
            j ++; 
        }
   }


}

//Big O
//Big Theta
//constant time -> 0(1) -> amount of data doesn't matter
//arrey.length //constant time
//Linear time - O(n) -> n is the amount of things on the list
//printing the array
