package classloadertest;

import util.OutUtil;

public class Main {
	
	C ma = new C("ma");		// 打印结果显示ma并未进行初始化
	static C mb = new C("mb");	
	
	public Main(){
		OutUtil.print("I am Main!");
	}
	
	static{	
		OutUtil.print(mb.getClass().getCanonicalName());
	}
	
	public static void main(String[] args) {
		OutUtil.print("Main");
		Child child = new Child();
		child.show();
		OutUtil.print(C.A);
		OutUtil.print(C.showC());
	}
	
	static Child mc = new Child("mc");
}
