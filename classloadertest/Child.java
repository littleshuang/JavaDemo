package classloadertest;

import util.OutUtil;

public class Child extends Father {

	// �Ǿ�̬����
	C ca = new C("ca");

	// ��̬����
	static final int T = 28;

	// ���췽��
	public Child() {
		super();
		OutUtil.print("Construct method in Child! ");
	}

	// ���ι�����
	public Child(String name) {
		OutUtil.print("Construct method in Child! " + "Name = " + name);
	}

	// �Ǿ�̬�����
	{
		OutUtil.print("Common blocks in Child! ");
	}

	// ��̬����
	static void staticShow() {
		OutUtil.print("Static method in Child! ");
	}

	// �Ǿ�̬����
	void show() {
		OutUtil.print("Common method in Child! ");
	}

	// ��̬����
	static C cb = new C("cb");

	// ��̬����
	static {
		OutUtil.print("Static blocks 1 in Child! ");
	}

	// ��̬����
	static {
		OutUtil.print("Static blocks 2 in Child! ");
	}

}
