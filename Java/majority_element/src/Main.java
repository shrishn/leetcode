public class Main {
    public static void main(String[] args) {
        int[] nums=new int[]{2,2,1,1,1,2,2};
        int maj_element=findMajEle(nums);
        System.out.println("Major Element is : "+maj_element);    
        System.exit(0);    
    }
    public static int findMajEle(int[] nums){
        int freq=0,ME=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ME=nums[i];
            }
            if(ME==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ME;
    }
}