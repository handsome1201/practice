package second0307;

public class Pet {
	String petname;
	String mastername;
	
	
	public Pet(String petname, String mastername) {
		this.petname=petname;
		this.mastername=mastername;
	}
	
	public String getPetName() {
		return petname;
	}
	public String getMasterName() {
		return mastername;
	}
	
	public void introduce() {
		System.out.println("���̸��� "+mastername+"�Դϴ�.");
		System.out.println("�� �ֿϵ��� �̸��� "+petname+"�Դϴ�.");
	}
}

