public class Solution{
	public static void main(String []args){
		int n=removeDuplicates(new int[]{1,1,1,2,2,3});
		System.out.println(n);
	}

	public int removeDuplicates(int[] nums) {
        int dupliCounter=0;
        int writeIndex=1;
        int currElement=nums[0];
        for (int i =1;i<nums.length;i++){
            if (nums[i]==currElement){
                dupliCounter++;
            }
            else {
                currElement=nums[i];
                dupliCounter=0;
            }
            if(dupliCounter <=1){
				System.out.println("1 "+writeIndex);
                nums[writeIndex++]=nums[i];
				System.out.println("2 "+writeIndex);
            }
        }
        return writeIndex;

    }
	
}

