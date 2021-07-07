package demo;
import java.util.*;
import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
	int[] nums = {1,3,4,5,3,1,3,4,2,1,2,2,};
 	 HashMap<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<nums.length;i++){
         if(map.containsKey(nums[i])){
             int z = map.get(nums[i]);
             z += 1;
             map.put(nums[i],z);
         }else{
             map.put(nums[i],1);
         }
     }
     
     List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
     
     Collections.sort(list,new Comparator<Map.Entry <Integer,Integer>>() {

		
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			
			return o1.getKey().compareTo(o2.getKey());
		}

		
    	 
     });
     
     System.out.println(list);
   }
}



