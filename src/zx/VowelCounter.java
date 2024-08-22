package zx;

/* Practice selenium concepts
 * https://fireart.studio/blog/pagination-design-examples/
 * https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/
 * https://testautomationpractice.blogspot.com/
 * https://demo.seleniumeasy.com/javascript-alert-box-demo.html
 */
	public class VowelCounter {
	    public static void main(String[] args) {
	        String at = "Sushil";
	        countVowels(at);
	    }

	    public static void countVowels(String input) {
	        int count = 0;
	        String vowels = "AEIOUaeiou";
	        
	        for (int i = 0; i < input.length(); i++) {
	            if (vowels.indexOf(input.charAt(i)) != -1) {
	                count++;
	            }
	        }
	         
	        System.out.println(count);
	    }
	    
	   
	        public static void main() {
	            String name = "Arjun";
	            int vowelCount = countVowels2(name);
	            System.out.println("Number of vowels in the string \"" + name + "\": " + vowelCount);
	        }

	        public static int countVowels2(String str) {
	            int count = 0;
	            str = str.toLowerCase(); // Convert the string to lowercase to handle both uppercase and lowercase vowels
	            for (int i = 0; i < str.length(); i++) {
	                char ch = str.charAt(i);
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    count++;
	                }
	            }
	            return count;
	        }
	    }

	

