class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i,j=0,k=0;
        int n=nums.length/2;
        int odd[]=new int[n];
        int even[]=new int[n];
        int a[]=new int[nums.length];

        for(i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                even[j++]=nums[i];
            }
            else{
                odd[k++]=nums[i];
            }
        }
        j=0;
        k=0;
      
        for(i=0;i<nums.length;i++){
            if(i%2==0){
                a[i]=even[j++];
            }
            else{
                a[i]=odd[k++];
            }
        }
        return a;
        
    }
}
