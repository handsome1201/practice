package practicedata;

class Headphone implements wearable{
	int volume=0;

	public void puton(){
		System.out.println("�ص��� ������");
	}
	public void putoff(){
		System.out.println("�ص��� ����");
	}
	public void setVolume(int volume) {
		this.volume= volume;
		System.out.println("������ "+volume+"�Դϴ�.");
	}
}