class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length){

            if(nums[i] < nums.length && nums[i] != i){
                swap(nums,i,nums[i]);
            }else{
                i++;
            }
        }
        //search for the missing number
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length ;
    }
    static void swap(int arr[],int last,int max){
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}