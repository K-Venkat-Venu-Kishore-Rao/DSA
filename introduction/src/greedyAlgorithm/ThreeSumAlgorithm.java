package greedyAlgorithm;

import java.util.Arrays;

public class ThreeSumAlgorithm{
	public static void main(String[] args) {
		
		
	}
	
	public boolean findTriplets(int arr[] , int n) {
		Arrays.sort();
		for(int i=0; i<n; i++) {
			if(twoSum(arr , -arr[] , int x)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean twoSum(int a[] , int x; int i) {
		int j = a.length - 1;
		if(a[i] > a[j] > x) {
			j--;
		}else if(a[i] + a[j] < x) {
			i++;
		}else {
			return true;
		}
	}
	return false;
}