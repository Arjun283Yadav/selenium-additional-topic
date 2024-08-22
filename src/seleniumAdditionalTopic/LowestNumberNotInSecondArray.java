package seleniumAdditionalTopic;
	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.Set;

import org.openqa.selenium.grid.Main;

	public class LowestNumberNotInSecondArray {
			
	    public static void main(String[] args) {
	    	
	    m1();
	  
	    	
	        int[] arr1 = {1, 3, 2, 5, 4};
	        int[] arr2 = {2, 5, 1};

	        int lowestNumber = findLowestNumberNotInSecondArray(arr1, arr2);
	        System.out.println("The lowest number from the first array not present in the second array is: " + lowestNumber);
	    }

	    public static int findLowestNumberNotInSecondArray(int[] arr1, int[] arr2) {
	        // Sort the first array
	        Arrays.sort(arr1);

	        // Create a set from the second array for quick lookup
	        Set<Integer> set = new HashSet<>();
	        for (int num : arr2) {
	            set.add(num);
	        }

	        // Iterate through the sorted first array and find the lowest number not in the set
	        for (int num : arr1) {
	            if (!set.contains(num)) {
	                return num;
	            }
	        }

	        // If all numbers are present in the second array, return -1 or any appropriate value
	        return -1;
	    }
	    
	   
	        public static void m1() {
	            int[] arr1 = {1, 3, 2, 5, 4};
	            int[] arr2 = {2, 5, 1};

	            int lowestNumber = findLowestNumberNotInSecondArray(arr1, arr2);
	            System.out.println("The lowest number from the first array not present in the second array is: " + lowestNumber);
	        }

	        public static int findLowestNumberNotInSecondArray2(int[] arr1, int[] arr2) {
	            // Sort the first array manually using bubble sort
	            bubbleSort(arr1);

	            // Check each element in the sorted arr1 and see if it's in arr2
	            for (int num1 : arr1) {
	                boolean found = false;
	                for (int num2 : arr2) {
	                    if (num1 == num2) {
	                        found = true;
	                        break;
	                    }
	                }
	                if (!found) {
	                    return num1;
	                }
	            }

	            // If all numbers are present in the second array, return -1 or any appropriate value
	            return -1;
	        }

	        public static void bubbleSort(int[] arr) {
	            int n = arr.length;
	            boolean swapped;
	            for (int i = 0; i < n - 1; i++) {
	                swapped = false;
	                for (int j = 0; j < n - 1 - i; j++) {
	                    if (arr[j] > arr[j + 1]) {
	                        // Swap arr[j] and arr[j + 1]
	                        int temp = arr[j];
	                        arr[j] = arr[j + 1];
	                        arr[j + 1] = temp;
	                        swapped = true;
	                    }
	                }
	                // If no two elements were swapped by inner loop, then break
	                if (!swapped) break;
	            }
	        }
	    }

	


