
public class P34 {
	public static void main(String [] args) {
		int num1 = 10, num2 = 5;
		
		System.out.println("NUM1   NUM2的各種運算:");
		System.out.println("NUM1 + NUM2 = :"+(num1+num2));
		System.out.println("NUM1 - NUM2 = :"+(num1-num2));
		System.out.println("NUM1 * NUM2 = :"+(num1*num2));
		System.out.println("NUM1 / NUM2 = :"+(num1/num2));
		System.out.println("NUM1 % NUM2 = :"+(num1%num2));
		
		int a = 0 ,b = 0 ,c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("因為是在指定值之後才遞增，所以B為:"+b);
		System.out.println("因為是在遞增之後才指定值，所以A為:"+c);
	}
}
