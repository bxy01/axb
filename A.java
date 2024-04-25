
import java.util.*;
public class A 
{
	public static void main(String[] args) 
	{
		List<String> a = new Vector<String>();
		a.add("abc");
		a.add("xyz");
		a.add("Test OK!");
		
		System.out.println(a.get(2));
	}
}
