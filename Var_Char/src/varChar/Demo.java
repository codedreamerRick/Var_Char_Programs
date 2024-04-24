package varChar;

public class Demo {

	static void disp(int... a)
	{
		for(int i : a)
		{
			System.out.println(i);
		}
	}
	
	static int add(int... a)
	{
		int sum = 0;
		for(int i : a)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		disp(10);
		System.out.println(add(10));
		disp(10, 20,67,7,87);
		System.out.println(add(10, 20));
		disp(10, 20, 30);
		System.out.println(add(10, 20, 30));
		int[] arr = {12,34,56,78};
		disp(arr);
		System.out.println(add(arr));
	}
}
