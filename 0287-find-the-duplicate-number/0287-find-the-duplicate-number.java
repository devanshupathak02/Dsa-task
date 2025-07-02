class Solution {
    public int findDuplicate(int[] nums) {
         
        int i=0;
        while(i<nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }

        }
         // duplicate would be the last index always as the arrays is now sorted
        return nums[nums.length-1];
    }
    static void swap(int arr[],int last,int max){
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
        
    
}