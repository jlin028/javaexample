
public class TestDrive {
	
	public static void main(String[] args)
	{
		System.out.println("Hello Github!");
		System.out.println("second test!");
		
		System.out.println(isPalindrome("Abc1221cba"));
		System.out.println(isPalindrome("a123bc"));
	}
	
	public static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length() -1;
		while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
		while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
		while (i < j)
		{
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
