package classloadertest;

import util.OutUtil;

public class Father {
	// �Ǿ�̬����
	C fa = new C("fa");
	
	public static String str = "str in Father";
	
	// ��̬����
	static C fb = new C("fb");

	// ��̬����
	static {
		OutUtil.print("Static blocks 1 in Father! ");
	}

	// ��̬����
	static {
		OutUtil.print("Static blocks 2 in Father! ");
	}
	
	// ��̬����
	static final int T = 28;

	// ���췽��
	public Father() {
		super();
		OutUtil.print("Construct method in Father! ");
	}

	// ���ι�����
	public Father(String name) {
		OutUtil.print("Construct method in Father! " + "Name = " + name);
	}

	// �Ǿ�̬�����
	{
		OutUtil.print("Common blocks in Father! ");
	}

	// ��̬����
	static void staticShow() {
		OutUtil.print("Static method in Father! ");
	}

	// �Ǿ�̬����
	void show() {
		OutUtil.print("Common method in Father! ");
	}

}
