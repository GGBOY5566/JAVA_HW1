import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class P28 {
	public static void main(String [] args)throws IOException 
	{
		System.out.println("請輸入一整數:");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.println("你輸入的數字:"+num);
		System.out.println("請輸入字串:");
		
		BufferedReader br2 = 
			new BufferedReader(new InputStreamReader(System.in));		
		String str2 = br2.readLine();
		
		System.out.println("你輸入的字串:"+str2);
		
	}
}
