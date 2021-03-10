package practicedata;

class Headphone implements wearable{
	int volume=0;

	public void puton(){
		System.out.println("해드폰 착용함");
	}
	public void putoff(){
		System.out.println("해드폰 벗음");
	}
	public void setVolume(int volume) {
		this.volume= volume;
		System.out.println("볼륨은 "+volume+"입니다.");
	}
}