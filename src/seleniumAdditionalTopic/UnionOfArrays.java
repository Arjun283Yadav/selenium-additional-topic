package seleniumAdditionalTopic;
	import java.util.*;

	public class UnionOfArrays {
		
		public static void main(String[] args) {
			m();
		}
		
		
		
	    public static void main() {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read first array
	        String[] input1 = scanner.nextLine().split(" ");
	        int[] arr1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
	        
	        // Read second array
	        String[] input2 = scanner.nextLine().split(" ");
	        int[] arr2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();
	        
	        // Using a set to store distinct elements
	        Set<Integer> unionSet = new HashSet<>();
	        
	        // Add elements from both arrays to the set
	        for (int num : arr1) {
	            unionSet.add(num);
	        }
	        for (int num : arr2) {
	            unionSet.add(num);
	        }
	        
	        // Output the size of the set, which is the number of distinct elements in the union
}
	    
	    
	    public static void m() {
	        int[] arr = {5, 2, 9, 1, 5, 6};

	        // Sort in ascending order
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Ascending Order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	    
	    
	    
	    
	    
	    
	}
