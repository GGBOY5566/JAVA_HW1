import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class P28 {
	public static void main(String [] args)throws IOException 
	{
		System.out.println("�п�J�@���:");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.println("�A��J���Ʀr:"+num);
		System.out.println("�п�J�r��:");
		
		BufferedReader br2 = 
			new BufferedReader(new InputStreamReader(System.in));		
		String str2 = br2.readLine();
		
		System.out.println("�A��J���r��:"+str2);
		
	}
}
