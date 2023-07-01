
// customized sorting order based on the Comparator interface
import java.util.*;
public class Example1
{
	public static void main(String args[])
	{
		ArrayList<String> l=new ArrayList<String>();
		                  l.add("Mahesh");
		                  l.add("Deva");
		                  l.add("John");
		                  l.add("Anand");
		                  l.add("SuryaPrabha");
		                  l.add(new StringBuffer("StringValue"));
		System.out.println("Before sorting value:"+l);
		Collections.sort(l,new MyComparator());
		System.out.println("After sorting value:"+l);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String str1=obj1.toString();
		String str2=obj2.toString();
		return str2.compareTo(str1);
	}
}