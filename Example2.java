
// Default natural sorting order example 
import java.util.*;
public class Example2
{
	public static void main(String args[])
	{
		ArrayList<String> l=new ArrayList<String>();
		                  l.add("Mahesh");
		                  l.add("Deva");
		                  l.add("John");
		                  l.add("Anand");
		                  l.add("SuryaPrabha");
		System.out.println("Before sorting value:"+l);
		Collections.sort(l);
		System.out.println("After sorting value:"+l);                 
	}
}
/*class MyComparator implements Comparator 
{
	public int compare(Object obj1,Object obj2)
	{
		String str1=(String)obj1;
		String str2=(String)obj2;
		return str2.compareTo(str1);
	}
} */