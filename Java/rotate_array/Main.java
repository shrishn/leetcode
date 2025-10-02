public class Main {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7};
        int k=3;
        rotateArray(nums,k);
           
    }
    public static void rotateArray(int[] nums,int k){
        int n=nums.length;
        k%=n;
        reversearray(nums, 0, n-1);
        reversearray(nums, 0, k-1);
        reversearray(nums, k, n-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        
    }
    public static void reversearray(int[] subarr,int start,int end){
        int temp=0;
        while(start<end){
            temp=subarr[start];
            subarr[start]=subarr[end];
            subarr[end]=temp;
            start++;
            end--;                     
        }
    }
}