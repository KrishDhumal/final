//read
//my solution
/*class Solution {
    public boolean isAnagram(String s, String t) 
    {
         s = s.toLowerCase();
         t = t.toLowerCase();
         if(s.length()!=t.length())
         {
            return false ;
         }
         char[] Arr1 = s.toCharArray();
         char[] Arr2 = t.toCharArray();
         Arrays.sort(Arr1);
         Arrays.sort(Arr2);
         return Arrays.equals(Arr1,Arr2);
    }
}*/
public class CheckAnagram {

	public static void main(String[] args) {

		String s1 = "store";
		String s2 = "resta";
		boolean flag = true;

		// Check if they are anagram strings

		for (int i = 0; i < s1.length(); i++) {
			if (s2.indexOf(s1.charAt(i)) == -1) {
				flag = false;
				break;
			}
		}
		System.out.println(s1.length() == s2.length() && flag ? "Anagram" : "Not Anagram");
		
		// ANother version
		
		if(s1.length() != s2.length()) 
			System.out.println("Not Anagram");
		else {
			for (int i = 0; i < s1.length(); i++) {
				if (s2.indexOf(s1.charAt(i)) == -1) {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "Anagram" : "Not Anagram");
		}
	}
}
