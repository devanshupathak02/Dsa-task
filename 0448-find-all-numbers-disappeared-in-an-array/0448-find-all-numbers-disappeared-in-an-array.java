class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> arr=new ArrayList<>();

        int i=0;
        while(i<nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }

        }
        //storing the missing number in array list
        for(int j=0;j<nums.length;j++){
            
            if(nums[j] !=j+1 ){
                arr.add(j+1);
            }
        }
        return arr;

    }
    static void swap(int[]nums,int a,int b){
        int temp=nums[a];
         nums[a]=nums[b];
         nums[b]= temp;
    }
}