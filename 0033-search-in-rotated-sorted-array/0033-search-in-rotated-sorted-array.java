class Solution {
    public int search(int[] nums, int target) {
        int pivot =pivot(nums);
        if(pivot==-1){
            return binary(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target >= nums[0]){
            return binary(nums,target,0,pivot-1);
        }else{
            return binary(nums,target,pivot+1,nums.length-1);
        }
    }
     static int pivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s <=e){
            int mid= s+ (e-s)/2;

            //4 condition for the pivot element
            if(mid > s && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }if( arr[mid]<=arr[s]){
                e=mid-1;
            }else{
                s=mid+1;
            }
            


        }
        
        
        return -1;
    }
    static int binary(int arr[],int target,int s,int e){

        

        while(s <= e){
            int mid= s + (e-s)/2;

            if(arr[mid]==target) return mid;
            else if(arr[mid] > target){
                e=mid-1;
            }else s=mid+1;
        }

        return -1;
    }
}