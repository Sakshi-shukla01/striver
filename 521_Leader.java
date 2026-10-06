class Solution {
    public List<Integer> leaders(int[] nums) {
        int max=Integer.MIN_VALUE;
        List<Integer> ans=new ArrayList<>();
        for(int i=nums.length;i>=0;i--){
            if(nums[i]>max){
                list.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
// Example 1:
// Input: nums = [1, 2, 5, 3, 1, 2]

// Output: [5, 3, 2]

// Explanation:

// 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]
