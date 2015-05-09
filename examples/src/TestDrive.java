
import java.util.ArrayList;

public class TestDrive {
	
	public static void main(String[] args)
	{
		//System.out.println("Hello Github!");
		//System.out.println("second test!");
		
		//System.out.println(isPalindrome("Abc1221cba"));
		//System.out.println(isPalindrome("a123bc"));
		//System.out.println(reverseWords("a bc de f    h i j   "));
//		System.out.println(reverseInt(1000000003));
//		System.out.println(Integer.MAX_VALUE);
		int x = Integer.parseInt("1000000000000000000000000000000", 2);
		System.out.println(Integer.toBinaryString(x));
		int y = reverseBit(x);
		System.out.println(Integer.toBinaryString(y));
	}
	
	public static int reverseBit(int n)
	{
		int result = 0;
		while (n != 0)
		{
			result = (result << 1) + n % 2;
			n >>= 1;
		}
		return result;
	}
	
	public static boolean isPalindrome(String s)
	{
		int i = 0; 
		int j = s.length() - 1;
		
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
	
	public static String reverseWords(String s)
	{
		StringBuilder reverse = new StringBuilder();
		int end = s.length();
		for (int start = s.length() - 1; start >= 0; start --)
		{
			if (s.charAt(start) == ' ')
			{
				end = start;
			}
			else if (start == 0 || s.charAt(start - 1) == ' ')
			{
				if (reverse.length() != 0)
				{
					reverse.append(' ');
				}
				reverse.append(s.substring(start, end));
			}
		}
		return reverse.toString();
	}
	
	public static String reverseWords1(String s)
	{
		StringBuilder reverse = new StringBuilder();
		ArrayList<String> strings = new ArrayList<String>();
		int start = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ' ')
			{
				start = i + 1;
			}
			else if (i == s.length() - 1 || s.charAt(i + 1) == ' ')
			{
				strings.add(s.substring(start, i + 1));
			}
		}
		for (int i = strings.size() - 1; i >= 0; i--)
		{
			reverse.append(strings.get(i));
		}
		return reverse.toString();		
	}
	
	public static int reverseInt(int x)
	{
		int result = 0;
		while (x != 0)
		{
			if (Math.abs(result) > (Integer.MAX_VALUE / 10))
			{
				return 0;
			}
			result = result * 10 + x % 10;
			x /= 10;
		}
		return result;
	}

}
