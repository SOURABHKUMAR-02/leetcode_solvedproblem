import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for(int i=0; i<nums.length; i++){
            if(ht.containsKey(nums[i])){
                 if(Math.abs(ht.get(nums[i])-i)<=k){
                    return true;
                 }
                 else{
                    ht.put(nums[i],i);
                 }
            }else{
                 ht.put(nums[i],i);
            }
        }
        return false;
    }
}