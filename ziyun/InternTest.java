package ziyun;

public class InternTest {

	public static void print(String a, boolean b) {
		String str = new StringBuilder().append(a).append(b).toString();
		System.out.println(str);
	}

	public void testIntern() {
		String str1 = "aaa";
		String str2 = "aaa";
		String str3 = new String("aaa");
		String str4 = new String();
		str4 += "aaa";
		String str5 = new StringBuilder("aaa").toString();
		StringBuilder str = new StringBuilder();
		String str6 = str.append("aaa").toString();
		String str1i = str1.intern();
		String str2i = str2.intern();
		String str3i = str3.intern();
		String str4i = str4.intern();
		String str5i = str5.intern();
		String str6i = str6.intern();

		print("str1==str2? ", str1 == str2);
		print("str1==str3? ", str1 == str3);
		print("str1==str4? ", str1 == str4);
		print("str1==str5? ", str1 == str5);
		print("str1==str6? ", str1 == str6);
		print("str1==str1i? ", str1 == str1i);
		print("str1==str2i? ", str1 == str2i);
		print("str1==str3i? ", str1 == str3i);
		print("str1==str4i? ", str1 == str4i);
		print("str1==str5i? ", str1 == str5i);
		print("str1==str6i? ", str1 == str6i);
	}
	
	class A{  
	      
	}  
	  
	class B extends A {  
	      
	}  
	  
	class C extends B {  
	      
	}  
	
	public static void testInstance() {
		
	}
	
	public static void main(String[] args) {
		InternTest inter = new InternTest();
        B b = inter.new B();  
        A a = inter.new A();  
          
        B bc = inter.new C();  
        A ac = inter.new C();  
        
        System.out.println(bc.getClass().getName());
	}
}
