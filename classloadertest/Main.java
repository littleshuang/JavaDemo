package classloadertest;

import util.OutUtil;

public class Main {
	
	C ma = new C("ma");		// ��ӡ�����ʾma��δ���г�ʼ��
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
