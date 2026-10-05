class Solution {
    public int[] productExceptSelf(int[] nums) {

    int[] arr = new int[nums.length];

    int left=1;
    int right=1;

    for(int i=0; i<nums.length; i++){
        arr[i]=left;
        left*=nums[i];
    }
    for(int j=nums.length-1; j>=0; j-- ){
        arr[j]*=right;
        right *=nums[j];
    }
    return arr;
    }
}  
