class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = Integer.MIN_VALUE;
        int keyOfMax = -1;
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],0);
            map.put(nums[i], map.get(nums[i])+1);
        }

        for(var j: map.entrySet()){
            if(j.getValue()>max){
                max = j.getValue();
                keyOfMax = j.getKey();

            }
        }
        return keyOfMax;
    }
}