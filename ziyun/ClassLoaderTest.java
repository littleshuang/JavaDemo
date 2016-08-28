package ziyun;

public class ClassLoaderTest {
	
	class A{
		public A() {
			print("Construct A!");
		}
		
		static final double PI = 3.1415;
//		static int a = 2;
//		static String b = new String("aaa");
	}
	
	public void print(String str){
		System.out.println(str);
	}
}
