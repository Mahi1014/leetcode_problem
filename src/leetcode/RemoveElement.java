package leetcode;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr= {3,2,2,3,3,4,56,2,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int val=sc.nextInt();
		int n=removeElement(arr , val);		
		System.out.println(n);
	}
	 public static int removeElement(int[] nums, int val) {
	        int size=nums.length;
	        int k=size;
	        for(int i=0;i<size;i++){
	            if(nums[i]==val){
	                nums[i]=nums[size-1];
	                k--;
	                i--;
	                size--;
	            }
	        }
	        return k;
	    }

}

// leet code problem no 27 -- remove element....
