class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int low = i + 1;
            int high = nums.length - 1;
            if(low > high || nums[i] > 0){
                break;
            }
            while(low < high){
                int sum = nums[low] + nums[high] + nums[i];
                if(sum > 0){
                    high--;
                }else if(sum < 0){
                    low++;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    if(!list.contains(temp)){
                        list.add(temp);
                    }
                    low++;
                }
            }
        }
        return list;
    }
}
