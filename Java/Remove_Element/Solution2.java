public class Solution2{
	public static void main(String []args){
		int n =remove_element(new int[]{3,2,2,3},3);
		System.out.println(n);

	}
	public static int remove_element(int []nums,int val){
		int j=0;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]!=val){
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}

}
