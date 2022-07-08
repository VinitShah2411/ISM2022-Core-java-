public class StringDemo
{
	public static void main(String arg[])
	{
		String s = "corejava";
		char ch[] = {'v','i','n','i','t'};
		String s1 = new String(ch);
		String s2 = new String("royal");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------------------------------");
		char c = s.charAt(3);	//Find char by giving Index
		System.out.println(c);
		int St = s.length();    //Find length of string
		System.out.println(St);
		int st1 = s.indexOf('a'); //Find Char index By passing Character
		System.out.println(st1);
	}
}