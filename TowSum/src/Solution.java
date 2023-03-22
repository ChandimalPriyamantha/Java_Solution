
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] list;
        int a;
        for(int i = 0; i<nums.size(); i++){
            for(a = 1; i<nums.size(); a++){
                if(nums[i] + nums[a] == target){
                    list.add(mums[i]);
                    list.add(nums[a]);
                }
            }
            a  = a +1;
        }
        System.out.print(list);

    }



}