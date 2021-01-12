import java.util.ArrayList;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        
        //store the default value of an integer and the location (indexOf) of the smallest value- take first number as a reference 
        Integer c=nums.get(0);
        //write a for loop to loop through the entire list
        for(int i=1;i<nums.size();i++){      
        if(nums.get(i)<c){
            c=nums.get(i);
            
        }
        
        }
        //compare the default and smallest value and store the new smallest value
        nums.remove(nums.indexOf(c));
    
        //remove the smallest value in the list
        
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
