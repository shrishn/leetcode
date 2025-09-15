public class Solution{
	public static void main (String []args){
	
		int n= removeElement(new int[]{3,2,2,3},3);
		System.out.println(n);
	}
	public static int removeElement(int[] nums,int val){
		int n = nums.length-1;
		int k=0;
		int i=0;
		int j=n;
		while(i<=j){
			if (nums[j]==val){
				j--;
			}
			else if(nums[i]==val){
				nums[i]=nums[i]+nums[j];
				nums[j]=nums[i]-nums[j];
				nums[i]=nums[i]-nums[j];
				System.out.println(nums[i]+" "+nums[j]);
				j--;k++;i++;
			}
			else{
				k++;
				i++;
			}

		}
		return k;

	}

}
