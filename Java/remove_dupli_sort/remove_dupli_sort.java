public class remove_dupli_sort {
	public static void main(String []args){
		int n=removeDuplicates(new int[]{1,1,2});
		System.out.println(n);
	}
    
	public static int removeDuplicates(int []nums){
		int i=0;
		int j=1;


		while(i<nums.length-1){
			//System.out.println(i);
			if(nums[i]==nums[i+1]){
				i++;
						
			}
			else
			{
				nums[j]=nums[i+1];
				j++;
				i++;
			}
		}
		//for (int k=0;k<nums.length;k++){
		//	System.out.println("h"+nums[k]);
		//}
		return j;
	}
	
}

