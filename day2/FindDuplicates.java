package week1.day2;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = {2,4,4,6,8,6,9};
		for (int i = 0; i < nums.length; i++) {	
		
for (int j = i+1; j < nums.length; j++) {
	if (nums[i]==nums[j])
	{
		System.out.println(nums[i]);
	}
	
}
	}
		}
}
